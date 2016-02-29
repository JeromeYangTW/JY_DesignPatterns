package structural.facade;


public class SubsysBJY
{
	private static SubsysBJY _inst = null;  /* Instance */
	public static int amount;
	
	private SubsysBJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized SubsysBJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new SubsysBJY();
		
		amount = 100;
		return _inst;
	}
	
	public void DoCalculate()
	{
		amount *= 2;
	}
}

