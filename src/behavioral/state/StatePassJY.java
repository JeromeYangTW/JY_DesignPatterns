package behavioral.state;


public class StatePassJY implements StateAgentJY
{
	private static StatePassJY _inst = null;  /* Instance */
	private StatePassJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized StatePassJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new StatePassJY();
		return _inst;
	}
	
	@Override
	public void DoRight( StateJY state ) { /* Nothing to do */ }
		
	@Override
	public void DoWrong( StateJY state )
	{
		int score = state.GetScore();
		if ( score<StateJY._OBSERVED_LB_ )
		{
			state.ChangeState( _DROPPED_STATE_ );
		}
		else if ( score<StateJY._PASSED_LB_ )
		{
			state.ChangeState( _OBSERVED_STATE_ );
		}
		else
		{
			/* Nothing to do */
		}
	}
}

