package info.thereisonlywe.quran.text;

import info.thereisonlywe.core.essentials.DataEssentials;
import info.thereisonlywe.core.essentials.IOEssentials;
import info.thereisonlywe.core.essentials.IOEssentialsAndroid;
import info.thereisonlywe.core.essentials.StringEssentials;
import info.thereisonlywe.core.essentials.SystemEssentials;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class QuranicTextManager
{
	public static final String ROOT_ADDRESS = "http://QuranServer.thereisonlywe.info/texts/";
	public static final String TEXTS_PATH = SystemEssentials
		.isRunningOnAndroid() ? (IOEssentialsAndroid.PATH_EXTERNAL_STORAGE + "/thereisonlywe/texts"):
		 "thereisonlywe/texts";

	public static ArrayList<QuranicTextIdentifier> getLocalTexts()
	{
		final ArrayList<QuranicTextIdentifier> qti = new ArrayList<QuranicTextIdentifier>();
		final QuranicTextIdentifier[] all = getTextsOnServer();
		for (final QuranicTextIdentifier element : all)
		{
			if (element.getFile().exists())
			{
				qti.add(element);
			}
		}
		return qti;
	}

	public static ArrayList<Integer> getOutdatedTextIDs()
	{
		final ArrayList<Integer> tobeupdated = new ArrayList<Integer>();
		final String s[] = StringEssentials.splitLines(IOEssentials
			.readString(new File(TEXTS_PATH + File.separator + "FileLengths.txt")));
		for (final String element : s)
		{
			final String st[] = StringEssentials.splitStatement(element, "=");
			final File f = new File(TEXTS_PATH + File.separator + st[0]);
			if (f.exists() && f.length() != Long.parseLong(st[1]))
			{
				tobeupdated.add(Integer.valueOf(st[0]));
			}
		}
		return tobeupdated;
	}

	public static boolean isOutdated(int ID)
	{
		final File f = new File(TEXTS_PATH + File.separator + ID);
		if (!f.exists()) return true;
		long length = Long.parseLong(StringEssentials.splitStatement(
			IOEssentials.fetchLine(new File(TEXTS_PATH + File.separator
				+ "FileLengths.txt"), ID + 1), "=")[1]);
		if (f.length() != length) return true;
		return false;
	}

	public static boolean isOutdated(String ID)
	{
		if (ID.length() <= 3) return isOutdated(Integer.parseInt(ID));
		else return true;
	}

	public static File getTextFile(int ID)
	{
		return new File(TEXTS_PATH + File.separator + ID);
	}

	public static File getTextFile(String ID)
	{
		return new File(TEXTS_PATH + File.separator + ID);
	}

	public static int getCompleteness(int ID)
	{
		File f = new File(TEXTS_PATH + File.separator + "FileCompletenesses.txt");
		if (f.exists()) { return Integer.valueOf(IOEssentials.fetchLine(f, ID + 1)
			.split("=")[1]); }
		return 0;
	}

	public static QuranicTextIdentifier getTextIdentifier(int TextID)
	{
		final QuranicTextIdentifier[] texts = getTextsOnServer();
		for (final QuranicTextIdentifier text : texts)
		{
			if (text.getID() == TextID) { return text; }
		}
		return null;
	}

	public static QuranicTextIdentifier[] getTextsOnServer()
	{
		if (!getTextFile("Files.txt").exists()) return new QuranicTextIdentifier[] {};
		String[] s = IOEssentials.readStrings(new File(TEXTS_PATH + File.separator
			+ "Files.txt"));
		final QuranicTextIdentifier results[] = new QuranicTextIdentifier[s.length];
		for (int i = 0; i < s.length; i++)
		{
			results[i] = new QuranicTextIdentifier(s[i]);
		}
		s = null;
		return results;
	}

	public static List<QuranicTextIdentifier> getTextsOnServer(
		QuranicTextType type, int minimumCompletion)
	{
		return getTextsOnServer(type, minimumCompletion, null);
	}

	public static List<QuranicTextIdentifier> getTextsOnServer(
		QuranicTextType type, int minimumCompletion, String languageCode)
	{
		String[] s = StringEssentials.splitLines(IOEssentials.readString(new File(
			TEXTS_PATH + File.separator + "Files.txt")));
		final QuranicTextIdentifier results[] = new QuranicTextIdentifier[s.length];
		int k = 0;
		for (int i = 0; i < s.length; i++)
		{
			QuranicTextIdentifier temp = new QuranicTextIdentifier(s[i]);
			if (temp.getType().equals(type)
				&& (languageCode == null || temp.getLanguageCode().equals(languageCode))
				&& getCompleteness(temp.getID()) >= minimumCompletion)
			{
				results[k] = temp;
				k++;
			}
		}
		s = null;
		return DataEssentials.removeNullElements(results);
	}

	public static void updateLocalTexts()
	{
		updateLocalTexts(getOutdatedTextIDs());
	}

	public static void updateLocalTexts(ArrayList<Integer> textCodes)
	{
		for (int i = 0; i < textCodes.size(); i++)
		{
			updateText(textCodes.get(i));
		}
	}

	public static boolean updateText(int textCode)
	{
		return updateText(String.valueOf(textCode));
	}

	public static boolean updateText(int textCode, int updatePolicy)
	{
		return updateText(String.valueOf(textCode), updatePolicy);
	}

	public static boolean updateText(String textCode, int updatePolicy)
	{
		if (isOutdated(textCode))
		{
			final File f = new File(TEXTS_PATH + File.separator + textCode);
			return IOEssentials.update(f,
				IOEssentials.toURL(ROOT_ADDRESS + textCode), updatePolicy);
		}
		else return true;
	}

	public static boolean updateText(String textCode)
	{
		return updateText(textCode, IOEssentials.FILE_UPDATE_POLICY_STRICT);
	}

	public static boolean retrieveText(String textCode)
	{
		return updateText(textCode, IOEssentials.FILE_UPDATE_POLICY_NEVER);
	}

	public static boolean retrieveText(int textCode)
	{
		return updateText(textCode, IOEssentials.FILE_UPDATE_POLICY_NEVER);
	}

	public static boolean retrieveTextLengthsFile()
	{
		return IOEssentials.update(new File(TEXTS_PATH + File.separator
			+ "FileLengths.txt"),
			IOEssentials.toURL(ROOT_ADDRESS + "FileLengths.txt"),
			IOEssentials.FILE_UPDATE_POLICY_NEVER);
	}

	public static boolean retrieveTextCompletenessesFile()
	{
		return IOEssentials.update(new File(TEXTS_PATH + File.separator
			+ "FileCompletenesses.txt"),
			IOEssentials.toURL(ROOT_ADDRESS + "FileCompletenesses.txt"),
			IOEssentials.FILE_UPDATE_POLICY_NEVER);
	}

	public static boolean retrieveTextsFile()
	{
		return IOEssentials.update(new File(TEXTS_PATH + File.separator
			+ "Files.txt"), IOEssentials.toURL(ROOT_ADDRESS + "Files.txt"),
			IOEssentials.FILE_UPDATE_POLICY_NEVER);
	}

	public static boolean retrieveMushaf(String mushaf)
	{
		return IOEssentials.update(new File(TEXTS_PATH + File.separator + mushaf),
			IOEssentials.toURL(ROOT_ADDRESS + mushaf),
			IOEssentials.FILE_UPDATE_POLICY_NEVER);
	}

	public static boolean updateMushaf(String mushaf)
	{
		return IOEssentials.update(new File(TEXTS_PATH + File.separator + mushaf),
			IOEssentials.toURL(ROOT_ADDRESS + mushaf),
			IOEssentials.FILE_UPDATE_POLICY_STRICT);
	}

	public static boolean updateTextCompletenessesFile()
	{
		return IOEssentials.update(new File(TEXTS_PATH + File.separator
			+ "FileCompletenesses.txt"),
			IOEssentials.toURL(ROOT_ADDRESS + "FileCompletenesses.txt"),
			IOEssentials.FILE_UPDATE_POLICY_STRICT);
	}

	public static boolean updateTextLengthsFile()
	{
		return IOEssentials.update(new File(TEXTS_PATH + File.separator
			+ "FileLengths.txt"),
			IOEssentials.toURL(ROOT_ADDRESS + "FileLengths.txt"),
			IOEssentials.FILE_UPDATE_POLICY_STRICT);
	}

	public static boolean updateTextsFile()
	{
		return IOEssentials.update(new File(TEXTS_PATH + File.separator
			+ "Files.txt"), IOEssentials.toURL(ROOT_ADDRESS + "Files.txt"),
			IOEssentials.FILE_UPDATE_POLICY_STRICT);
	}
	public static boolean init()
	{
		return QuranicTextManager.updateTextsFile()
			&& QuranicTextManager.updateTextLengthsFile()
			&& QuranicTextManager.updateTextCompletenessesFile();
	}
}
