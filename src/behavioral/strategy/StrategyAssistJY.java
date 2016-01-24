package behavioral.strategy;


public class StrategyAssistJY extends StrategyPlayJY
{
	private static StrategyAssistJY _inst = null;  /* Instance */
	private StrategyAssistJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized StrategyAssistJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new StrategyAssistJY();
		return _inst;
	}
	
	@Override
	public void Play()
	{
		int[] scores = { 2, 3 };
		score += scores[(int)(Math.random()*2)];
	}
}

