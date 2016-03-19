package creational.factory;


public abstract class ApplicationMgrJY
{
	ApplicationJY GetApplication( String type )
	{
		ApplicationJY app = GenApp( type );
    	app.Init();
    	app.DoCalculate();
		return app;
	}
    
    protected abstract ApplicationJY GenApp( String type );
}

