package behavioral.state;


public interface StateAgentJY
{
	public static final StateAgentJY _PASSED_STATE_ = StatePassJY.GetInstance();
	public static final StateAgentJY _OBSERVED_STATE_ = StateObserveJY.GetInstance();
	public static final StateAgentJY _DROPPED_STATE_ = StateDropJY.GetInstance();
	
	public void DoRight( StateJY state );
	public void DoWrong( StateJY state );
}


