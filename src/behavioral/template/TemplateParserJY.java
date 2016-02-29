package behavioral.template;


public abstract class TemplateParserJY 
{
	/* Handling Steps
		1. Read Data
		2. Parse Token & Validate
		3. Generate Model
	*/
	
	protected TemplateDataJY _data = null;
	
	public final TemplateDataJY DoParse()
	{
		ReadData();
		ParseToken();
		GenModel();		
		return _data;
	}
	
	abstract protected void ReadData();
	abstract protected void ParseToken();
	abstract protected void GenModel();
}
