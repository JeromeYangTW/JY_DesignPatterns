package creational.factory;


public class PostgreSqlDbJY extends FacDbJY
{
	public PostgreSqlDbJY() {}
	
	@Override
	public void DoInit()
	{
		System.out.println( "PostgreSQL Init() !" );
	}
	
	@Override
	public void CheckCond()
	{
		System.out.println( "Check PostgreSQL Condition ..." );
	}
}
