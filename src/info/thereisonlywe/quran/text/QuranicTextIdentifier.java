package info.thereisonlywe.quran.text;

import info.thereisonlywe.core.essentials.LanguageEssentials;
import java.io.File;

public class QuranicTextIdentifier
{
	public static final String SEPARATOR = ";";
	private String language; // lazy init
	private final String languageCode;
	private final String author;
	private final int type;
	private final int id;
	private final boolean rtl;

	public QuranicTextIdentifier(int id, String languageCode, String author,
		int type)
	{
		this.id = id;
		this.languageCode = languageCode;
		this.author = author;
		this.type = type;
		rtl = LanguageEssentials.isRightToLeftLanguage(languageCode);
		language = null;
	}

	public QuranicTextIdentifier(int id, String languageCode, String author,
		QuranicTextType type)
	{
		this.id = id;
		this.languageCode = languageCode;
		this.author = author;
		this.type = type.index;
		rtl = LanguageEssentials.isRightToLeftLanguage(languageCode);
		language = null;
	}

	public QuranicTextIdentifier(String representation)
	{
		final String[] vals = representation.split(SEPARATOR);
		id = Integer.parseInt(vals[0]);
		languageCode = vals[1];
		author = vals[2];
		type = Integer.parseInt(vals[3]);
		rtl = LanguageEssentials.isRightToLeftLanguage(languageCode);
		language = null;
	}

	@SuppressWarnings("unused")
	private QuranicTextIdentifier()
	{
		languageCode = null;
		author = null;
		type = -1;
		language = null;
		rtl = false;
		id = -1;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) { return true; }
		if (obj == null) { return false; }
		if (getClass() != obj.getClass()) { return false; }
		final QuranicTextIdentifier other = (QuranicTextIdentifier) obj;
		if (id != other.id) { return false; }
		return true;
	}

	public String getAuthor()
	{
		return author;
	}

	public File getFile()
	{
		return QuranicTextManager.getTextFile(id);
	}

	public int getID()
	{
		return id;
	}

	public String getLanguage()
	{
		if (language == null)
		{
			language = LanguageEssentials.getNativeLanguageName(languageCode);
		}
		return language;
	}

	public String getLanguageCode()
	{
		return languageCode;
	}

	public boolean isRightToLeft()
	{
		return rtl;
	}

	public QuranicTextType getType()
	{
		return QuranicTextType.get(type);
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public String toString()
	{
		return getLanguage() + " | " + getType().toString() + " | " + getAuthor();
	}
}
