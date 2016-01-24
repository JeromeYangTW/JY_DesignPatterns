package behavioral.strategy;


public class StrategyShootJY extends StrategyPlayJY
{
	private static StrategyShootJY _inst = null;  /* Instance */
	private StrategyShootJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized StrategyShootJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new StrategyShootJY();
		return _inst;
	}
	
	@Override
	public void Play()
	{
		int[] scores = { 0, 2, 3 };
		score += scores[(int)(Math.random()*3)];
	}
}

