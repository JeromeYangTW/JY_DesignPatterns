package creational.factory;


public class MsSqlDbJY extends FacDbJY
{
	public MsSqlDbJY() {}
	
	@Override
	public void DoInit()
	{
		System.out.println( "MsSql Init() !" );
	}
	
	@Override
	public void CheckCond()
	{
		System.out.println( "Check MsSql Condition ..." );
	}	
}

