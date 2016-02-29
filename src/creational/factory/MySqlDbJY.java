package creational.factory;


public class MySqlDbJY extends FacDbJY
{
	public MySqlDbJY() {}
	
	@Override
	public void DoInit()
	{
		System.out.println( "MySql Init() !" );
	}
	
	@Override
	public void CheckCond()
	{
		System.out.println( "Check MySql Condition ..." );
	}
}
