package behavioral.template;


public class TemplateFileParserJY extends TemplateParserJY
{
	String _source;
	public TemplateFileParserJY( String src )
	{
		_source = src;
	}
	
	@Override
	protected void ReadData()
	{
		System.out.println( "Reading File Data from "+_source );
	}
	
	@Override
	protected void ParseToken()
	{
		System.out.println( "Parsing File Token" );
	}
	
	@Override
	protected void GenModel()
	{
		System.out.println( "Generating Model by File Contents" );
		_data = new TemplateDataJY();
		_data.SetName( "Test.txt" );  _data.SetType( 1 );
	}
}
