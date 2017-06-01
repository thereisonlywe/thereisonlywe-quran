package info.thereisonlywe.quran;

import info.thereisonlywe.core.essentials.IOEssentials;
import info.thereisonlywe.core.essentials.MathEssentials;
import info.thereisonlywe.core.essentials.StringEssentials;
import info.thereisonlywe.core.search.SearchEngine;
import info.thereisonlywe.core.search.SearchModifier;
import info.thereisonlywe.core.search.SearchScope;
import info.thereisonlywe.quran.text.QuranicTextManager;
import java.io.File;
import java.util.HashSet;

public class Quran
{
	public static final int VERSE_COUNT = 6236;
	public static final int SECTION_COUNT = 114;
	public static final String MUSHAF_SIMPLIFIED = "QuranSimple.txt";
	public static final String MUSHAF_UTHMANI = "QuranUthmani.txt";
	public static final String MUSHAF_ENGLISH_LITERAL = "QuranLiteral_en.txt";
	// audhubillah is treated as a QuranicVerse with index -1
	public static final QuranicVerse AUDHUBILLAH = new QuranicVerse(-1, 0, 0);
	// char array is used for less memory usage
	private static char[][] quran = null;
	private static final QuranicVerse[] verses = new QuranicVerse[VERSE_COUNT];
	private static final QuranicVerseRange[] sections = new QuranicVerseRange[SECTION_COUNT];
	private static int[] prostrationVerseIndices;
	private static String mushaf = MUSHAF_UTHMANI;
	static
	{
		int verseCounts[] = QuranConstants.getVerseCounts();
		int counter = 0;
		for (int i = 0; i < SECTION_COUNT; i++)
		{
			final int len = verseCounts[i];
			for (int j = 0; j < len; j++)
			{
				verses[counter] = new QuranicVerse(counter, i + 1, j + 1);
				counter++;
			}
			sections[i] = new QuranicVerseRange(verses[counter - len],
				verses[counter - 1]);
		}
		verseCounts = null;
	}

	public static final boolean contains(String phrase, boolean diacriticFree)
	{
		if (diacriticFree) phrase = StringEssentials.removeDiacritics(phrase);
		for (int i = 0; i < Quran.VERSE_COUNT; i++)
		{
			if (diacriticFree ? getVerse(i).getContent_DiacriticFree().contains(
				phrase) : getVerse(i).getContent().contains(phrase)) return true;
		}
		return false;
	}

	public static final boolean contains(String phrase)
	{
		return contains(phrase, false);
	}

	public static final boolean containsWord(String word, boolean diacriticFree)
	{
		if (diacriticFree) word = StringEssentials.removeDiacritics(word);
		for (int i = 0; i < Quran.VERSE_COUNT; i++)
		{
			if (SearchEngine.contains_PhraseExactly(diacriticFree ? getVerse(i)
				.getContent_DiacriticFree() : getVerse(i).getContent(), word)) return true;
		}
		return false;
	}

	public static final boolean containsWord(String word)
	{
		return containsWord(word, false);
	}

	public static final int getInSectionVerseCount(int sectionNumber)
	{
		return sections[sectionNumber - 1].getVerseCount();
	}

	public static final int getInSectionVerseCount(QuranicVerse qv)
	{
		return getInSectionVerseCount(qv.getSectionNumber());
	}

	public static final String getMushaf()
	{
		return mushaf;
	}

	public static QuranicVerse getRandomVerse()
	{
		return verses[MathEssentials.newRandom(verses.length - 1)];
	}

	/**
	 * @param int position
	 * @return QuranicVerse itself
	 */
	public static QuranicVerse getVerse(int index)
	{
		if (isAValidVerse(index)) return verses[index];
		else return null;
	}

	public static QuranicVerse getVerse(int sectionNumber, int verseNumber)
	{
		if (sectionNumber == 0 && verseNumber == 0) return AUDHUBILLAH;
		else if (sectionNumber <= sections.length
			&& verseNumber <= getInSectionVerseCount(sectionNumber))
		{
			return verses[sections[sectionNumber - 1].start.getIndex() + verseNumber
				- 1];
		}
		else
		{
			return null;
		}
	}

	public static QuranicVerse getVerse(String notationString)
	{
		int i = notationString.indexOf(":");
		if (i < 0)
		{
			i = notationString.indexOf("/");
			if (i < 0)
			{
				if (notationString.length() <= 4)
				{
					return getVerse(Integer.parseInt(notationString));
				}
				else
				{
					i = 3;
					return getVerse(Integer.parseInt(new String(notationString.substring(
						0, i))), Integer.parseInt(new String(notationString.substring(i,
						notationString.length()))));
				}
			}
		}
		return getVerse(
			Integer.parseInt(new String(notationString.substring(0, i))),
			Integer.parseInt(new String(notationString.substring(i + 1,
				notationString.length()))));
	}

	public static String getVerseContent(QuranicVerse verse)
	{
		return getVerseContent(verse.getIndex());
	}

	public static String getVerseContent(int index)
	{
		if (!isAValidVerse(index)) return null;
		if (quran == null)
		{
			File f = QuranicTextManager.getTextFile(mushaf);
			if (f.exists() || QuranicTextManager.updateText(mushaf))
			{
				return IOEssentials.fetchLine(f, index + 1);
			}
			else return "";
		}
		return new String(quran[index]);
	}

	public static String getVerseContent_DiacriticFree(QuranicVerse verse)
	{
		return getVerseContent_DiacriticFree(verse.getIndex());
	}

	public static String getVerseContent_DiacriticFree(int index)
	{
		return StringEssentials.removeDiacritics(getVerseContent(index), false,
			false);
	}

	public static QuranicVerse[] getVerses()
	{
		return verses;
	}

	public static QuranicVerse[] getVerses(int sectionNumber)
	{
		return getVerses(sectionNumber, sectionNumber);
	}

	/**
	 * 
	 * @param startNo
	 * @param endNo
	 * @return QuranicVerse an array that contains the verses from the beginning
	 *         of a section to the end of another section.
	 */
	public static QuranicVerse[] getVerses(int startNo, int endNo)
	{
		final int index1 = sections[startNo - 1].start.getIndex();
		final int index2 = sections[endNo - 1].end.getIndex();
		final QuranicVerse[] result = new QuranicVerse[index2 - index1 + 1];
		int count = 0;
		for (int i = index1; i <= index2; i++)
		{
			result[count] = getVerse(i);
			count++;
		}
		return result;
	}

	public static HashSet<String> getWordsLike(String word,
		SearchModifier modifier, SearchScope scope)
	{
		HashSet<String> result = new HashSet<String>();
		for (int i = 0; i < VERSE_COUNT; i++)
		{
			String s[] = Quran.getVerseContent(i).split(" ");
			for (int j = 0; j < s.length; j++)
			{
				if (!result.contains(s[j]))
				{
					boolean b = SearchEngine.search(s[j], word, modifier, scope);
					if (b) result.add(s[j]);
				}
			}
		}
		return result;
	}

	public static final boolean isAProstrationVerse(QuranicVerse qv)
	{
		// lazy initialization
		if (prostrationVerseIndices == null)
		{
			prostrationVerseIndices = new int[] { getVerse(7, 206).getIndex(),
				getVerse(13, 15).getIndex(), getVerse(16, 50).getIndex(),
				getVerse(17, 109).getIndex(), getVerse(19, 58).getIndex(),
				getVerse(22, 18).getIndex(), getVerse(22, 77).getIndex(),
				getVerse(25, 60).getIndex(), getVerse(27, 26).getIndex(),
				getVerse(32, 15).getIndex(), getVerse(38, 24).getIndex(),
				getVerse(41, 38).getIndex(), getVerse(53, 62).getIndex(),
				getVerse(84, 21).getIndex(), getVerse(96, 19).getIndex() };
		}
		for (final int index : prostrationVerseIndices)
		{
			if (index == qv.getIndex()) { return true; }
		}
		return false;
	}

	public static final boolean isAValidVerse(int index)
	{
		if (verses.length > index && index >= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static final boolean isAValidVerse(int sNo, int vNo)
	{
		if (sections.length >= sNo && sNo >= 1)
		{
			if (sections[sNo - 1].isInRange(sNo, vNo)) { return true; }
		}
		return false;
	}

	public static void setMushaf(final String m)
	{
		if (!m.equals(mushaf))
		{
			mushaf = m;
			quran = null;
		}
	}

	public static boolean load()
	{
		quran = new char[VERSE_COUNT][];
		boolean success = false;
		File f = QuranicTextManager.getTextFile(mushaf);
		if (!f.exists())
		{
			success = QuranicTextManager.updateText(mushaf);
		}
		else success = true;
		if (success)
		{
			String[] linesX = StringEssentials.splitLines(IOEssentials
				.readStringUntilLine(f, VERSE_COUNT + 1, "UTF-8"));
			for (int i = 0; i < linesX.length; i++)
			{
				quran[i] = linesX[i].toCharArray();
			}
			linesX = null;
		}
		else
		{
			quran = null;
		}
		return success;
	}

	public static void unload()
	{
		quran = null;
	}
}
