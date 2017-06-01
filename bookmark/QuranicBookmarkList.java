package info.thereisonlywe.quran.bookmark;

import info.thereisonlywe.core.essentials.IOEssentials;
import info.thereisonlywe.quran.QuranicVerse;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author thereisonlywe
 */
public class QuranicBookmarkList
{
	private ArrayList<QuranicBookmark> bookmarks = new ArrayList<QuranicBookmark>();

	public boolean addBookmark(QuranicBookmark b)
	{
		if (!bookmarks.contains(b))
		{
			bookmarks.add(b);
			sort();
			return true;
		}
		else
		{
			for (int i = 0; i < bookmarks.size(); i++)
			{
				if (bookmarks.get(i).getPosition().equals(b.getPosition()))
				{
					bookmarks.get(i).setInfo(b.getInfo());
					return true;
				}
			}
		}
		return false;
	}

	public void addBookmarks(QuranicBookmark[] b)
	{
		for (int i = 0; i < b.length; i++)
		{
			if (!bookmarks.contains(b[i]))
			{
				bookmarks.add(b[i]);
			}
			else if (getNumberOfBookmarks() >= i
				&& bookmarks.get(i).getPosition().equals(b[i].getPosition()))
			{
				bookmarks.get(i).setInfo(b[i].getInfo());
			}
		}
		sort();
	}

	// Overrides identifiers with parameter 'name'
	public void addBookmarks(QuranicBookmark[] b, String name)
	{
		for (int i = 0; i < b.length; i++)
		{
			final int index = bookmarks.indexOf(b[i]);
			if (index < 0)
			{
				bookmarks.add(new QuranicBookmark(b[i].getPosition(), name));
			}
			else if (getNumberOfBookmarks() >= i
				&& bookmarks.get(index).getPosition() == b[i].getPosition())
			{
				bookmarks.get(index).setInfo(name);
			}
		}
		sort();
	}

	public void addBookmarks(QuranicVerse[] b, String comment)
	{
		for (int i = 0; i < b.length; i++)
		{
			if (!contains(b[i]))
			{
				bookmarks.add(new QuranicBookmark(b[i], comment));
			}
		}
		sort();
	}

	public void addBookmarksWithoutSorting(QuranicVerse[] b, String comment)
	{
		for (int i = 0; i < b.length; i++)
		{
			if (!contains(b[i]))
			{
				bookmarks.add(new QuranicBookmark(b[i], comment));
			}
		}
	}

	public void clearBookmarks()
	{
		bookmarks = new ArrayList<QuranicBookmark>();
	}

	public boolean contains(QuranicBookmark b)
	{
		for (int i = 0; i < bookmarks.size(); i++)
		{
			if (bookmarks.get(i).getPosition().equals(b.getPosition())) { return true; }
		}
		return false;
	}

	public boolean contains(QuranicVerse b)
	{
		for (int i = 0; i < bookmarks.size(); i++)
		{
			if (bookmarks.get(i).getPosition().equals(b)) { return true; }
		}
		return false;
	}

	public QuranicBookmark getBookmark(int index)
	{
		if (bookmarks.size() > index)
		{
			return bookmarks.get(index);
		}
		else
		{
			return null;
		}
	}

	public QuranicBookmark getBookmark(QuranicVerse v)
	{
		if (bookmarks.size() > 0)
		{
			for (int i = 0; i < bookmarks.size(); i++)
			{
				if (bookmarks.get(i).getPosition().equals(v)) { return bookmarks.get(i); }
			}
		}
		return null;
	}

	public String getBookmarkInfo(int index)
	{
		if (bookmarks.size() > index)
		{
			return bookmarks.get(index).getInfo();
		}
		else
		{
			return null;
		}
	}

	public QuranicVerse getBookmarkPosition(int index)
	{
		if (bookmarks.size() > index)
		{
			return bookmarks.get(index).getPosition();
		}
		else
		{
			return null;
		}
	}

	public QuranicBookmark[] getBookmarks()
	{
		final QuranicBookmark tmp[] = new QuranicBookmark[getNumberOfBookmarks()];
		return bookmarks.toArray(tmp);
	}

	public int getNumberOfBookmarks()
	{
		return bookmarks.size();
	}

	public int getOrder(QuranicVerse b)
	{
		for (int i = 0; i < bookmarks.size(); i++)
		{
			if (bookmarks.get(i).getPosition().equals(b)) { return i; }
		}
		return -1;
	}

	public boolean isEmpty()
	{
		return getNumberOfBookmarks() == 0;
	}

	public void loadBookmarks(final File f)
	{
		final QuranicBookmark[] b = QuranicBookmarkManager.getBookmarks(f);
		if (b == null) { return; }
		addBookmarks(b);
	}

	public void loadBookmarks(String readFile)
	{
		final QuranicBookmark[] b = QuranicBookmarkManager.getBookmarks(readFile);
		if (b == null) { return; }
		addBookmarks(b);
	}

	public boolean removeFromBookmarks(int index)
	{
		return removeFromBookmarks(index, true);
	}

	public boolean removeFromBookmarks(int index, boolean sort)
	{
		if (bookmarks.size() > index)
		{
			bookmarks.remove(index);
			if (sort)
			{
				sort();
			}
			return true;
		}
		else
		{
			return false;
		}
	}

	public void removeFromBookmarks(int[] indices)
	{
		for (final int indice : indices)
		{
			if (bookmarks.size() > indice)
			{
				bookmarks.remove(indice);
			}
		}
		sort();
	}

	public boolean removeFromBookmarks(QuranicBookmark b)
	{
		if (contains(b))
		{
			int index = bookmarks.indexOf(b);
			if (index == -1)
			{
				index = bookmarks.indexOf(getBookmark(b.getPosition()));
			}
			bookmarks.remove(index);
			sort();
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean removeFromBookmarks(QuranicVerse v)
	{
		if (contains(v))
		{
			int index = bookmarks.indexOf(getBookmark(v));
			bookmarks.remove(index);
			sort();
			return true;
		}
		else
		{
			return false;
		}
	}

	public void saveBookmarks(final File f)
	{
		final Thread save = new Thread()
		{
			@Override
			public void run()
			{
				final StringBuilder result = new StringBuilder();
				boolean firstrun = true;
				for (int i = 0; i < getNumberOfBookmarks(); i++)
				{
					if (!firstrun)
					{
						result.append("\n");
					}
					else
					{
						firstrun = false;
					}
					result.append(getBookmark(i).toString());
				}
				IOEssentials.write(result.toString(), f, false);
			}
		};
		new Thread(save).start();
	}

	public String saveBookmarks()
	{
		final StringBuilder result = new StringBuilder();
		boolean firstrun = true;
		for (int i = 0; i < getNumberOfBookmarks(); i++)
		{
			if (!firstrun)
			{
				result.append("\n");
			}
			else
			{
				firstrun = false;
			}
			result.append(getBookmark(i).toString());
		}
		return result.toString();
	}

	public boolean setBookmarkInfo(QuranicBookmark b)
	{
		if (bookmarks.size() > 0)
		{
			final QuranicBookmark tmp = getBookmark(b.getPosition());
			if (tmp == null)
			{
				return false;
			}
			else
			{
				bookmarks.get(bookmarks.indexOf(tmp)).setInfo(b.getInfo());
				return true;
			}
		}
		return false;
	}

	public boolean setBookmarkInfoAtIndex(int index, String info)
	{
		if (bookmarks.size() > index)
		{
			bookmarks.get(index).setInfo(info);
			return true;
		}
		return false;
	}

	public void sort()
	{
		Collections.sort(bookmarks);
	}
}
