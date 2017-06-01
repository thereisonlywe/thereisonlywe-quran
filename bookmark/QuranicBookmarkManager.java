package info.thereisonlywe.quran.bookmark;

import info.thereisonlywe.core.essentials.IOEssentials;
import info.thereisonlywe.core.essentials.IOEssentialsAndroid;
import info.thereisonlywe.core.essentials.StringEssentials;
import info.thereisonlywe.core.essentials.SystemEssentials;
import java.io.File;

public class QuranicBookmarkManager
{
	public static String BOOKMARKS_PATH = SystemEssentials.isRunningOnAndroid() ? IOEssentialsAndroid.PATH_EXTERNAL_STORAGE
		+ "/thereisonlywe/bookmarks"
		: "thereisonlywe/bookmarks";

	public static void appendToFile(File f, QuranicBookmark[] bookmarks)
	{
		if (!f.exists() || bookmarks == null)
		{
			return;
		}
		else
		{
			QuranicBookmarkList list = new QuranicBookmarkList();
			QuranicBookmark[] b = getBookmarks(f);
			list.addBookmarks(b);
			list.addBookmarks(bookmarks);
			createNewFileAndWrite(f, list.getBookmarks());
			list = null;
			b = null;
		}
	}

	public static void createNewFileAndWrite(File f, QuranicBookmark[] bookmarks)
	{
		if (f.exists())
		{
			f.delete();
		}
		final StringBuilder result = new StringBuilder();
		for (final QuranicBookmark bookmark : bookmarks)
		{
			result.append(bookmark.toString());
			result.append("\n");
		}
		if (!new File(BOOKMARKS_PATH).exists())
		{
			new File(BOOKMARKS_PATH).mkdir();
		}
		IOEssentials.write(result.toString(), f, false);
	}

	public static File getBookmarkListFile(String name)
	{
		return new File(BOOKMARKS_PATH + File.separator + name + ".qbm");
	}

	public static QuranicBookmark[] getBookmarks(File f)
	{
		if (!f.exists()) { return null; }
		String s = IOEssentials.fetchLine(f, 1);
		if (s == null || s.equals("")) { return null; }
		s = IOEssentials.readString(f);
		String[] bookmarks = StringEssentials.splitLines(s);
		final QuranicBookmark[] b = new QuranicBookmark[bookmarks.length];
		for (int i = 0; i < bookmarks.length; i++)
		{
			b[i] = new QuranicBookmark(bookmarks[i]);
		}
		bookmarks = null;
		return b;
	}

	public static QuranicBookmark[] getBookmarks(String readFile)
	{
		if (readFile == null || readFile.length() == 0) { return null; }
		// String s = IOEssentials.fetchLine(f, 1);
		// if(s == null || s.equals("")){ return null; }
		// s = IOEssentials.readString(f);
		String[] bookmarks = StringEssentials.splitLines(readFile);
		final QuranicBookmark[] b = new QuranicBookmark[bookmarks.length];
		for (int i = 0; i < bookmarks.length; i++)
		{
			b[i] = new QuranicBookmark(bookmarks[i]);
		}
		bookmarks = null;
		return b;
	}

	public static String[] getExistingBookmarkListNames()
	{
		final String[] list = new File(BOOKMARKS_PATH)
			.list(new IOEssentials.FileExtensionFilter("qbm"));
		for (int i = 0; i < list.length; i++)
		{
			final int in = list[i].indexOf(".qbm");
			if (in > 0)
			{
				list[i] = new String(list[i].substring(0, in));
			}
		}
		return list;
	}
}
