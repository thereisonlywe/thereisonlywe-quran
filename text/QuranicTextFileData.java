package info.thereisonlywe.quran.text;

/**
 * In order to read text once and get both content and completion data, we use a
 * QuranicTextFileData object
 * 
 * @author thereisonlywe
 */

public class QuranicTextFileData {

	private final String[] content;
	private final int completion;

	public QuranicTextFileData(String[] content, int completion)
	{
		super();
		this.content = content;
		this.completion = completion;
	}

	public int getCompletion()
	{
		return completion;
	}

	public String[] getContent()
	{
		return content;
	}

}
