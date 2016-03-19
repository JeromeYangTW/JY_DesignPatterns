package creational.factory;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestMiscMgr
{
	@Test
	public void TestAppMgr()
	{
		ApplicationMgrJY mgr = new DesktopAppMgrJY();
		ApplicationJY app = mgr.GenApp( "WORD" );

        assertEquals( app.getClass(), DesktopAppWord.class );
        assertNotEquals( app.getClass(), DesktopAppExcel.class );
        
        try
        {
            app = mgr.GenApp( "PHOTOSHOP" );
        }
        catch ( RuntimeException rex )
        {
        	assertTrue( "Non-supported phone app type.", true );
        }
        
        mgr = new PhoneAppMgrJY();
        app = mgr.GenApp( "ANDROID" );
        
        assertEquals( app.getClass(), PhoneAppAndroid.class );
	}

}
