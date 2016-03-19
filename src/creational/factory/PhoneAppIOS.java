package creational.factory;


public class PhoneAppIOS extends ApplicationJY
{
	@Override
    protected void Init()
    {
		System.out.println( "=== Application IOS Init() ===" );
    }
	
	@Override
    protected void DoCalculate()
    {
		System.out.println( "=== Application IOS DoCalculate() ===" );
    }
}

