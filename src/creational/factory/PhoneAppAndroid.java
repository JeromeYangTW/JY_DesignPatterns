package creational.factory;


public class PhoneAppAndroid extends ApplicationJY
{
	@Override
    protected void Init()
    {
		System.out.println( "=== Application Android Init() ===" );
    }
	
	@Override
    protected void DoCalculate()
    {
		System.out.println( "=== Application Android DoCalculate() ===" );
    }
}

