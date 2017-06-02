package info.thereisonlywe.quran.text;

import info.thereisonlywe.core.essentials.LocaleEssentials;

public enum QuranicTextType
{

	TRANSLATION_TEXT(0), TAFSIR_TEXT(1), TAWIL_TEXT(2), TRANSLITERATION_TEXT(3), HADITH_TEXT(
			4);

	public static final QuranicTextType get(int index)
	{
		for (final QuranicTextType v : values())
		{
			if (v.index == index) { return v; }
		}
		return null;
	}

	public final int index;

	private QuranicTextType(int index)
	{
		this.index = index;
	}

	@Override
	public String toString()
	{
		if (LocaleEssentials.LANGUAGE_DEFAULT
				.equals(LocaleEssentials.LANGUAGE_TURKISH))
		{
			switch (index)
			{
			case (0):
				return "Çeviri";
			case (1):
				return "Tefsir";
			case (2):
				return "Tevil";
			case (3):
				return "Okunuş";
			case (4):
				return "Hadis";
			default:
				return null;
			}
		}
		else
		{
			switch (index)
			{
			case (0):
				return "Translation";
			case (1):
				return "Tafsir";
			case (2):
				return "Tawil";
			case (3):
				return "Transliteration";
			case (4):
				return "Hadith";
			default:
				return null;
			}
		}
	}

}
