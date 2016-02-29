package creational.factory;


public abstract class FacDbMgrJY
{	
	FacDbJY GetDb( String type )
	{
		FacDbJY db = CreateDb( type );
		db.DoInit();
		db.CheckCond();
		return db;
	}
	
	abstract protected FacDbJY CreateDb( String type );
}
