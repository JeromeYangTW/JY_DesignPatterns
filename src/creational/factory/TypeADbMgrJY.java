package creational.factory;


public class TypeADbMgrJY extends FacDbMgrJY
{	
	@Override
	protected FacDbJY CreateDb( String type )
	{
		FacDbJY _db = null;
		switch ( type.toUpperCase() )
		{
			case "ORACLESQL":
				_db = new OracleSqlDbJY();
				break;
			case "MSSQL":
				_db = new MsSqlDbJY();
				break;
			default:
				throw new RuntimeException( "Unsupported DB Type !" );
		}
		return _db;
	}
}

