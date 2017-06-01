package info.thereisonlywe.quran.bookmark;

import info.thereisonlywe.core.essentials.StringEssentials;
import info.thereisonlywe.core.essentials.TimeEssentials;
import info.thereisonlywe.quran.Quran;
import info.thereisonlywe.quran.QuranicVerse;

/**
 * 
 * @author thereisonlywe
 */
public class QuranicBookmark implements Comparable<QuranicBookmark> {

	private QuranicVerse position;
	private String info;
	private long timestamp;

	public QuranicBookmark(QuranicVerse pos, String i)
	{
		position = pos;
		info = i;
		timestamp = System.currentTimeMillis();
	}

	public QuranicBookmark(String identifier)
	{
		String[] parts = identifier.split(StringEssentials.THEREISONLYWE_VALUE_SEPARATOR);
		position = Quran.getVerse(Integer.parseInt(parts[0]));
		info = parts[1];
		timestamp = Long.parseLong(parts[2]);
	}

	@SuppressWarnings("unused")
	private QuranicBookmark()
	{
	}

	public static QuranicVerse[] toVerseArray(QuranicBookmark[] b)
	{
		final QuranicVerse[] v = new QuranicVerse[b.length];
		for(int i = 0; i < b.length; i++)
		{
			v[i] = b[i].getPosition();
		}
		return v;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		else if(obj == null || obj.getClass() != this.getClass())
		{
			return false;
		}
		else if(obj instanceof QuranicBookmark)
		{
			final QuranicBookmark b = (QuranicBookmark)obj;
			if(b.info.equals(info) && b.position == position){ return true; }
		}
		return false;
	}

	public String getInfo()
	{
		return info;
	}

	public long getTimestamp()
	{
		return timestamp;
	}

	public String getTimestampAsString()
	{
		return TimeEssentials.getDateAndTime(timestamp);
	}

	public QuranicVerse getPosition()
	{
		return position;
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 53 * hash + (position != null ? position.hashCode() : 0);
		hash = 53 * hash + (info != null ? info.hashCode() : 0);
		return hash;
	}

	public void setInfo(String i)
	{
		info = i;
	}

	public void setPosition(QuranicVerse v)
	{
		position = v;
	}

	@Override
	public String toString()
	{
		return position.toString() + StringEssentials.THEREISONLYWE_VALUE_SEPARATOR + info
				+ StringEssentials.THEREISONLYWE_VALUE_SEPARATOR + timestamp;
	}

	@Override
	public int compareTo(QuranicBookmark arg0)
	{
		if(timestamp > arg0.timestamp) return -1;
		else return 1;
	}
}
