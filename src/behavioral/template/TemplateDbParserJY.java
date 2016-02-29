package behavioral.template;


public class TemplateDbParserJY extends TemplateParserJY
{
	String _source;
	public TemplateDbParserJY( String src )
	{
		_source = src;
	}
	
	@Override
	protected void ReadData()
	{
		System.out.println( "Reading DB Data from "+_source );
	}
	
	@Override
	protected void ParseToken()
	{
		System.out.println( "Parsing DB Token" );
	}
	
	@Override
	protected void GenModel()
	{
		System.out.println( "Generating Model by DB Contents" );
		_data = new TemplateDataJY();
		_data.SetName( "MSSQL" );  _data.SetType( 0 );
	}
}
