package creational.factory;


/* DesktopAppMgrJY as the role of desktop App factory */
public class DesktopAppMgrJY extends ApplicationMgrJY
{
	@Override
    public ApplicationJY GenApp( String type )
    {
    	ApplicationJY app = null;
    	switch ( type )
    	{
    	    case "WORD":
    	    	app = new DesktopAppWord();
    	    	break;
    	    case "EXCEL":
    	    	app = new DesktopAppExcel();
    	    	break;
    	    default:
    	    	throw new RuntimeException( "Non-supported phone app type." );
    	}
    	return app;
    }
}

