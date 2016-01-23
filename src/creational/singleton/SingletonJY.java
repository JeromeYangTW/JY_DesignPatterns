package creational.singleton;


public class SingletonJY
{
	private static SingletonJY _inst = null;  /* Instance */
	private SingletonJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized SingletonJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new SingletonJY();
		return _inst;
	}
}

