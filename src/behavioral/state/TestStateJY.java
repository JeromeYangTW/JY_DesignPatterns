package behavioral.state;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestStateJY
{
	@Test
	public void Test()
	{
		/* Step 1: Test Initial State */
		StateJY sjy = new StateJY();
		assertNotNull( sjy.GetStateAgent() );
		assertEquals( sjy.GetStateAgent().getClass(), StatePassJY.class );
		assertEquals( 100, sjy.GetScore() );
		
		/* Step 2: Test State Transition */
		sjy.DoRight( 20 );
		assertEquals( 100, sjy.GetScore() );
		assertEquals( sjy.GetStateAgent().getClass(), StatePassJY.class );		
		
		sjy.DoWrong( 50 );
		assertEquals( 50, sjy.GetScore() );
		assertEquals( sjy.GetStateAgent().getClass(), StateObserveJY.class );
		
		sjy.DoRight( 10 );
		assertEquals( 60, sjy.GetScore() );
		assertEquals( sjy.GetStateAgent().getClass(), StatePassJY.class );
		
		sjy.DoWrong( 100 );
		assertEquals( 0, sjy.GetScore() );
		assertEquals( sjy.GetStateAgent().getClass(), StateDropJY.class );
		
		sjy.DoWrong( 10 );
		assertEquals( 0, sjy.GetScore() );
		assertEquals( sjy.GetStateAgent().getClass(), StateDropJY.class );
	}

}
