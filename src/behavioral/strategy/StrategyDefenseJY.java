package behavioral.strategy;


public class StrategyDefenseJY extends StrategyPlayJY
{
	private static StrategyDefenseJY _inst = null;  /* Instance */
	private StrategyDefenseJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized StrategyDefenseJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new StrategyDefenseJY();
		return _inst;
	}
	
	@Override
	public void Play()
	{
		int[] scores = { 0, 2, 3 };
		score += scores[(int)(Math.random()*3)];
	}
}

