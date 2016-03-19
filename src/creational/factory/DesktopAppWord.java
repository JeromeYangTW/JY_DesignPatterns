package creational.factory;


public class DesktopAppWord extends ApplicationJY
{
	@Override
    protected void Init()
    {
		System.out.println( "=== Application Word Init() ===" );
    }
	
	@Override
    protected void DoCalculate()
    {
		System.out.println( "=== Application Word DoCalculate() ===" );
    }
}

