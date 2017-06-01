package info.thereisonlywe.quran;

import info.thereisonlywe.core.objects.SequentialRange;

public class QuranicVerseRange implements SequentialRange<QuranicVerse> {

	public final QuranicVerse	start;
	public final QuranicVerse	end;

	public QuranicVerseRange(QuranicVerse start, QuranicVerse end)
	{
		this.start = start;
		this.end = end;
	}

	public int getVerseCount()
	{
		return end.getIndex() - start.getIndex() + 1;
	}

	public boolean isInRange(int sectionNo, int verseNo)
	{
		if(sectionNo >= start.getSectionNumber() && sectionNo <= end.getSectionNumber())
		{
			if(verseNo >= start.getVerseNumber() && verseNo <= end.getVerseNumber()){ return true; }
		}
		return false;
	}

	@Override
	public boolean isInRange(QuranicVerse k)
	{
		if(k.getIndex() >= start.getIndex() && k.getIndex() <= end.getIndex())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
