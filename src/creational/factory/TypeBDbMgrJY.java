package creational.factory;


public class TypeBDbMgrJY extends FacDbMgrJY
{	
	@Override
	protected FacDbJY CreateDb( String type )
	{
		FacDbJY _db = null;
		switch ( type.toUpperCase() )
		{
			case "MYSQL":
				_db = new MySqlDbJY();
				break;
			case "POSTGRESQL":
				_db = new PostgreSqlDbJY();
				break;
			default:
				throw new RuntimeException( "Unsupported DB Type !" );
		}		
		return _db;
	}
}

