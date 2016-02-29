package creational.factory;


public class OracleSqlDbJY extends FacDbJY
{
	public OracleSqlDbJY() {}
	
	@Override
	public void DoInit()
	{
		System.out.println( "Oracle Sql Init() !" );
	}
	
	@Override
	public void CheckCond()
	{
		System.out.println( "Check Oracle Condition ..." );
	}
}

