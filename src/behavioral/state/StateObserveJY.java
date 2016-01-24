package behavioral.state;


public class StateObserveJY implements StateAgentJY
{
	private static StateObserveJY _inst = null;  /* Instance */
	private StateObserveJY() {}
	
	/* Synchronized for Thread-Safe */
	public static synchronized StateObserveJY GetInstance()
	{
		/* Lazy Initialization */
		if ( null==_inst )  _inst = new StateObserveJY();
		return _inst;
	}
	
	@Override
	public void DoRight( StateJY state )
	{
		if ( state.GetScore()>=StateJY._PASSED_LB_ )
		{
			state.ChangeState( _PASSED_STATE_ );
		}
	}
	
	@Override
	public void DoWrong( StateJY state )
	{
		if ( state.GetScore()<StateJY._OBSERVED_LB_ )
		{
			state.ChangeState( _DROPPED_STATE_ );
		}
	}
}
