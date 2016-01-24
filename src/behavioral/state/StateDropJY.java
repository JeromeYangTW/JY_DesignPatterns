package behavioral.state;


public class StateDropJY implements StateAgentJY
{
	private static StateDropJY _inst = null;  /* Instance */
	private StateDropJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized StateDropJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new StateDropJY();
		return _inst;
	}
	
	@Override
	public void DoRight( StateJY state )
	{
		int score = state.GetScore();
		if ( score>=StateJY._PASSED_LB_ )
		{
			state.ChangeState( _PASSED_STATE_ );
		}
		else if ( score>=StateJY._OBSERVED_LB_ )
		{
			state.ChangeState( _OBSERVED_STATE_ );
		}
		else
		{
			/* Nothing to do */
		}
	}
	
	@Override
	public void DoWrong( StateJY state ) { /* Nothing to do */}
}
