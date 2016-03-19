package creational.factory;


public class DesktopAppExcel extends ApplicationJY
{
	@Override
    protected void Init()
    {
		System.out.println( "=== Application Excel Init() ===" );
    }
	
	@Override
    protected void DoCalculate()
    {
		System.out.println( "=== Application Excel DoCalculate() ===" );
    }
}

