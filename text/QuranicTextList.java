package info.thereisonlywe.quran.text;

import java.util.ArrayList;

/**
 * @author thereisonlywe
 */

public class QuranicTextList {

	private static ArrayList<QuranicText> texts = new ArrayList<QuranicText>();

	public synchronized static void addText(int textID)
	{
		addText(new QuranicText(textID + ";" + getNextOrder()));

	}

	public synchronized static void addText(QuranicText text)
	{
		texts.add(text);
	}

	public static int getIndexByOrder(int order)
	{
		for(int i = 0; i < texts.size(); i++)
		{
			if(texts.get(i).getOrder() == order){ return i; }
		}
		return -1;
	}

	public static QuranicText getTextByOrder(int order)
	{
		int i = getIndexByOrder(order);
		if(i == -1) return null;
		else return texts.get(i);
	}

	public static int getNextOrder()
	{
		int k = 0;
		for(int i = 0; i < texts.size(); i++)
		{
			if(texts.get(i).getOrder() >= k)
			{
				k++;
				i = -1;
			}
		}
		return k;
	}

	public static int getPreferred()
	{
		return getIndexByOrder(0);
	}

	public static QuranicText getPreferredText()
	{
		return getTextByOrder(0);
	}

	// public static QuranicText getText(int index)
	// {
	// if(texts.size() > index)
	// {
	// return texts.get(index);
	// }
	// else
	// {
	// return null;
	// }
	// }

	public static QuranicText getTextByID(int textID)
	{
		final int index = indexOf(textID);
		return index > -1 ? texts.get(index) : null;
	}

	public static QuranicText getTextByIdentifier(QuranicTextIdentifier qti)
	{
		final int index = indexOf(qti);
		return index > -1 ? texts.get(index) : null;
	}

	public static QuranicText getTextByInfo(String language, String author)
	{
		final int index = indexOf(language, author);
		return texts.get(index);
	}

	public static int getTextCount()
	{
		return texts.size();
	}

	public static void remove(int index)
	{
		final int currentOrder = texts.get(index).getOrder();
		final int nextOrder = getNextOrder();
		texts.get(index).setOrder(-1);
		for(int i = currentOrder + 1; i < nextOrder; i++)
		{
			setOrder(getIndexByOrder(i), i - 1);
		}
		texts.remove(index);
	}

	public static int indexOf(int textID)
	{
		for(int i = 0; i < texts.size(); i++)
		{
			if(texts.get(i).getIdentifier().getID() == textID){ return i; }
		}
		return -1;
	}

	public static int indexOf(QuranicText text)
	{
		for(int i = 0; i < texts.size(); i++)
		{
			if(texts.get(i).equals(text)){ return i; }
		}
		return -1;
	}

	public static int indexOf(QuranicTextIdentifier qti)
	{
		for(int i = 0; i < texts.size(); i++)
		{
			if(texts.get(i).getIdentifier().equals(qti)){ return i; }
		}
		return -1;
	}

	public static int indexOf(String language, String author)
	{
		for(int i = 0; i < texts.size(); i++)
		{
			if(texts.get(i).getIdentifier().getLanguage().equals(language)
					&& texts.get(i).getIdentifier().getAuthor().equals(author)){ return i; }
		}
		return -1;
	}

	public static boolean moveTextDown(int index)
	{
		final int order = texts.get(index).getOrder();
		final int i = getIndexByOrder(order + 1);
		if(order < texts.size() - 1 && i != -1)
		{
			texts.get(i).setOrder(order);
			texts.get(index).setOrder(order + 1);
			return true;
		}
		return false;
	}

	public static boolean moveTextUp(int index)
	{
		final int order = texts.get(index).getOrder();
		final int i = getIndexByOrder(order - 1);
		if(order > 0 && i != -1)
		{
			texts.get(i).setOrder(order);
			texts.get(index).setOrder(order - 1);
			return true;
		}
		return false;
	}

	private static void setOrder(int index, int order)
	{
		if(index < 0){ return; }
		texts.get(index).setOrder(order);
	}

	public static void removeAll()
	{
		texts = new ArrayList<QuranicText>();
	}

}
