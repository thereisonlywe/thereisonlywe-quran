package info.thereisonlywe.quran;

import info.thereisonlywe.core.essentials.LocaleEssentials;
import info.thereisonlywe.quran.bookmark.QuranicBookmark;

/**
 * 
 * @author thereisonlywe
 */
public class QuranicVerse implements Comparable<QuranicVerse> {

	public static QuranicBookmark[] asBookmark(QuranicVerse[] v)
	{
		final QuranicBookmark[] b = new QuranicBookmark[v.length];
		for(int i = 0; i < b.length; i++)
		{
			b[i] = new QuranicBookmark(v[i], "");
		}
		return b;
	}

	public static QuranicBookmark[] asBookmark(QuranicVerse[] v, String info)
	{
		final QuranicBookmark[] b = new QuranicBookmark[v.length];
		for(int i = 0; i < b.length; i++)
		{
			b[i] = new QuranicBookmark(v[i], info);
		}
		return b;
	}

	public static QuranicBookmark[] asBookmark(QuranicVerse[] v, String[] infos)
	{
		final QuranicBookmark[] b = new QuranicBookmark[v.length];
		for(int i = 0; i < b.length; i++)
		{
			b[i] = new QuranicBookmark(v[i], infos[i]);
		}
		return b;
	}

	public static QuranicVerse[] asVerses(int[] array)
	{
		final QuranicVerse[] result = new QuranicVerse[array.length];
		for(int i = 0; i < array.length; i++)
		{
			result[i] = Quran.getVerse(array[i]);
		}
		return result;
	}

	private final int sectionNo;

	private final int verseNo;

	private final int index;

	protected QuranicVerse(final int index, final int sectionNo, final int verseNo)
	{
		this.index = index;
		this.sectionNo = sectionNo;
		this.verseNo = verseNo;
	}

	/**
	 * QuranicVerses are already defined by Quran class. We don't create new
	 * QuranicVerse objects, but rather get them from Quran. This is both safer
	 * and more efficient.
	 */
	@SuppressWarnings("unused")
	private QuranicVerse()
	{
		index = 0;
		sectionNo = 1;
		verseNo = 1;
	}

	@Override
	public int compareTo(QuranicVerse aThat)
	{
		if(this == aThat){ return 0; }

		if(index < aThat.index){ return -1; }
		if(index > aThat.index){ return 1; }

		return 0;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj){ return true; }
		if(obj == null){ return false; }
		if(getClass() != obj.getClass()){ return false; }
		final QuranicVerse other = (QuranicVerse)obj;
		if(index != other.index){ return false; }
		return true;
	}

	public String getContent()
	{
		return Quran.getVerseContent(index);
	}

	public String getContent_DiacriticFree()
	{
		return Quran.getVerseContent_DiacriticFree(index);
	}

	public int getIndex()
	{
		return index;
	}

	public QuranicVerse getNextNthVerse(int n)
	{
		QuranicVerse v = this;
		while(n > 0)
		{
			v = v.getNextVerse();
			n--;
		}
		return v;
	}

	public QuranicVerse getNextVerse()
	{
		if(Quran.AUDHUBILLAH.equals(this))
		{
			return Quran.getVerse(0);
		}
		else if(index < Quran.VERSE_COUNT - 1)
		{
			return Quran.getVerse(index + 1);
		}
		else
		{
			return null;
		}
	}

	public QuranicVerse getNextVerseInSection()
	{
		final QuranicVerse v = getNextVerse();
		if(v == null)
		{
			return null;
		}
		else if(v.getSectionNumber() == getSectionNumber())
		{
			return v;
		}
		else
		{
			return null;
		}
	}

	public int getNumberOfRemainingVerses()
	{
		return Quran.VERSE_COUNT - (index + 1);
	}

	public int getNumberOfRemainingVersesInSection()
	{
		return Quran.getInSectionVerseCount(sectionNo) - verseNo;
	}

	public QuranicVerse getPreviousVerse()
	{
		if(Quran.getVerse(0).equals(this))
		{
			return Quran.AUDHUBILLAH;
		}
		else if(index >= 1)
		{
			return Quran.getVerse(index - 1);
		}
		else
		{
			return null;
		}
	}

	public QuranicVerse getPreviousVerseInSection()
	{
		final QuranicVerse v = getPreviousVerse();
		if(v == null)
		{
			return null;
		}
		else if(v.getSectionNumber() == getSectionNumber())
		{
			return v;
		}
		else
		{
			return null;
		}
	}

	public int getSectionNumber()
	{
		return sectionNo;
	}

	public QuranicVerse[] getSimilarVerses()
	{
		return QuranConstants.getSimilarVerses(this);
	}

	public int getVerseNumber()
	{
		return verseNo;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
		return result;
	}

	public boolean isAProstrationVerse()
	{
		return Quran.isAProstrationVerse(this);
	}

	public boolean isSimilarTo(QuranicVerse qv)
	{
		final QuranicVerse[] s = getSimilarVerses();
		for(final QuranicVerse v: s)
		{
			if(v == qv){ return true; }
		}
		return false;
	}

	public String toIDString()
	{
		return toReadableIDString().replace(":", "");
	}

	public String toReadableIDString()
	{
		String temp = String.valueOf(sectionNo);
		String temp2 = String.valueOf(verseNo);
		if(temp.length() == 2)
		{
			temp = "0" + temp;
		}
		else if(temp.length() == 1)
		{
			temp = "00" + temp;
		}
		if(temp2.length() == 2)
		{
			temp2 = "0" + temp2;
		}
		else if(temp2.length() == 1)
		{
			temp2 = "00" + temp2;
		}
		temp = temp + ":" + temp2;
		temp2 = null;
		return temp;
	}

	public String toLongNotationString()
	{
		return toLongNotationString(LocaleEssentials.LANGUAGE_DEFAULT);
	}

	public String toLongNotationString(String lang)
	{
		return sectionNo + "-" + QuranConstants.getSectionName(sectionNo, lang) + ":" + verseNo;
	}

	public String toNotationString()
	{
		return toNotationString(':');
	}

	public QuranicBookmark asBookmark()
	{
		return new QuranicBookmark(this, "");
	}

	public QuranicBookmark asBookmark(String info)
	{
		return new QuranicBookmark(this, info);
	}

	public String toNotationString(char separatorChar)
	{
		return new String("" + sectionNo + separatorChar + verseNo);
	}

	@Override
	public String toString()
	{
		return String.valueOf(index);
	}
}
