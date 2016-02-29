package behavioral.template;

public class TemplateDataJY
{
	private String _name;
	private int _type = 0;
	
	public void SetName( String name )
	{
		_name = name;
	}
	public String GetName()
	{
		return _name;
	}
	public void SetType( int type )
	{
		_type = type;
	}
	public int GetType()
	{
		return _type;
	}
}
