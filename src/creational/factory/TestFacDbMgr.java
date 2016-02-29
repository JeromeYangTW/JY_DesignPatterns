package creational.factory;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestFacDbMgr
{
    @Test
	public void TypeATest()
	{
    	TypeADbMgrJY mgr = new TypeADbMgrJY();
    	FacDbJY db = mgr.CreateDb( "MSSQL" );
    	
    	assertEquals( MsSqlDbJY.class, db.getClass() );
    	assertNotEquals( OracleSqlDbJY.class, db.getClass() );
    	    	
    	try
    	{
    		db = mgr.CreateDb( "NOSQL" );
    	}
    	catch ( RuntimeException ex )
    	{
    		assertTrue( "Unsupported DB Type: NoSql", true );
    	}
	}
    
    @Test
	public void TypeBTest()
	{
    	TypeBDbMgrJY mgr = new TypeBDbMgrJY();
    	FacDbJY db = mgr.CreateDb( "MYSQL" );
    	
    	assertEquals( MySqlDbJY.class, db.getClass() );
	}
}

