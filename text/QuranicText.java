package info.thereisonlywe.quran.text;

import info.thereisonlywe.core.essentials.IOEssentials;
import info.thereisonlywe.core.essentials.StringEssentials;
import info.thereisonlywe.core.essentials.SystemEssentials;
import info.thereisonlywe.quran.QuranicVerse;

import java.io.File;

/**
 * @author thereisonlywe
 */
public class QuranicText implements Comparable<QuranicText> {

	private QuranicTextIdentifier textIdentifier;
	private int order;

	public QuranicText(QuranicTextIdentifier textIdentifier, int order)
	{
		this.textIdentifier = textIdentifier;
		this.order = order;
	}

	public QuranicText(String text)
	{
		parseText(text);
	}

	public String asString()
	{
		final String res = textIdentifier.getID() + ";" + order;
		return res;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		QuranicText other = (QuranicText)obj;
		if(order != other.order) return false;
		if(textIdentifier == null)
		{
			if(other.textIdentifier != null) return false;
		}
		else if(!textIdentifier.equals(other.textIdentifier)) return false;
		return true;
	}

	public QuranicTextIdentifier getIdentifier()
	{
		return textIdentifier;
	}

	// public final String getName()
	// {
	// return textIdentifier.getLanguageCode() + ";"
	// + textIdentifier.getAuthor() + ";" + textIdentifier.getType();
	// }

	public int getOrder()
	{
		return order;
	}

	public String getVerseContent(int v)
	{
		File f = QuranicTextManager.getTextFile(textIdentifier.getID());
		if(f.exists()
				|| QuranicTextManager.updateText(textIdentifier.getID()))
		{
			return IOEssentials.fetchLine(f, v + 1).replace(StringEssentials.THEREISONLYWE_LINE_SEPARATOR, "\n");
		}
		else return "";
	}

	public String getVerseContent(QuranicVerse v)
	{
		return getVerseContent(v.getIndex());
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + order;
		result = prime * result + ((textIdentifier == null) ? 0 : textIdentifier.hashCode());
		return result;
	}

	public boolean isPreferred()
	{
		return order == 0;
	}

	public void setOrder(int i)
	{
		order = i;
	}

	private void parseText(String text)
	{
		int counter = 0;
		int previousindex = 0;
		byte field = 0;
		while(counter < text.length())
		{
			if(text.charAt(counter) == ';')
			{
				if(field == 0)
				{
					textIdentifier = QuranicTextManager.getTextIdentifier(Integer.parseInt(new String(text.substring(
							previousindex, counter))));
					previousindex = counter + 1;
					field++;
				}
			}
			counter++;
		}
		if(field != 0)
		{
			order = Byte.valueOf(new String(text.substring(previousindex, text.length())));
		}
	}

	@Override
	public int compareTo(QuranicText qt)
	{
		if(qt.getOrder() == this.getOrder()) return new String(this.getIdentifier().getLanguageCode() + "-"
				+ this.getIdentifier().getAuthor() + "-" + this.getIdentifier().getType()).compareTo(new String(qt
				.getIdentifier().getLanguageCode()
				+ "-"
				+ qt.getIdentifier().getAuthor()
				+ "-"
				+ qt.getIdentifier().getType()));

		else
		{
			if(qt.getOrder() == -1 || this.getOrder() == -1)
			{
				if(qt.getOrder() > this.getOrder()) return 1;
				else return -1;
			}

			else
			{
				if(qt.getOrder() < this.getOrder()) return 1;
				else return -1;
			}
		}

	}
}
