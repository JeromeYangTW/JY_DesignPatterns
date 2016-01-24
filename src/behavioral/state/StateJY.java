package behavioral.state;


public class StateJY {
	/* Scenario:
	 * A tester whose state is passed (score: 100) initially.
	 * */
	public static final int _PASSED_LB_ = 60;  /* To Pass Lower Bound */
	public static final int _OBSERVED_LB_ = 1;  /* To Observe Lower Bound */
	public static final int _DROPED_LB_ = 0;  /* To Drop Lower Bound */
	private static int _MAXSCORE_= 100;
	private static int _MINSCORE_= 0;
	
	private StateAgentJY _agent = null;
	
	private int _score = 0;
	public StateJY()
	{
		_agent = StatePassJY.GetInstance();
		_score = _MAXSCORE_;
	}
	
	public int GetScore()
	{
		return _score;
	}
	
	public StateAgentJY GetStateAgent()
	{
		return _agent;  /* Delegation */
	}
	
	public void ChangeState( StateAgentJY state )
	{
		_agent = state;
	}
	
	public void DoRight( int val )
	{
		_score += val;
		if ( _score>_MAXSCORE_ )  _score = _MAXSCORE_;
		_agent.DoRight( this );
	}
	
	public void DoWrong( int val )
	{
		_score -= val;
		if ( _score<_MINSCORE_ )  _score = _MINSCORE_;
		_agent.DoWrong( this );
	}
}

