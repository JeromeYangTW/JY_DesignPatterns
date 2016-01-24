package behavioral.strategy;


public class PlayerJY {
	/* Scenario:
	 * 
	 * */
	StrategyPlayJY _strategy = null;
	public PlayerJY( StrategyPlayJY strategy )
	{
		_strategy = strategy;
	}
	
	public void ChangeStrategy( StrategyPlayJY strategy )
	{
		int score = _strategy.score;
		_strategy = strategy;
		_strategy.score = score;
	}
	
	public void Play()
	{
		_strategy.Play();
	}
	
	public int GetScore()
	{
		return _strategy.score;
	}
}


