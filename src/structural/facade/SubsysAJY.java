package structural.facade;


public class SubsysAJY
{
	private static SubsysAJY _inst = null;  /* Instance */
	public static int amount;

	private SubsysAJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized SubsysAJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new SubsysAJY();
		
		amount = 150;
		return _inst;
	}
	
	public void DoCalculate()
	{
		amount += 100;
	}
}

