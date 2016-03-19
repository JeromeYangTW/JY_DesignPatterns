package creational.factory;


/* PhoneAppMgrJY as the role of phone App factory */
public class PhoneAppMgrJY extends ApplicationMgrJY
{
	@Override
    public ApplicationJY GenApp( String type )
    {
    	ApplicationJY ajy = null;
    	switch ( type )
    	{
    	    case "IOS":
    	    	ajy = new PhoneAppIOS();
    	    	break;
    	    case "ANDROID":
    	    	ajy = new PhoneAppAndroid();
    	    	break;
    	    default:
    	    	throw new RuntimeException( "Non-supported phone app type." );
    	}
    	return ajy;
    }
}

