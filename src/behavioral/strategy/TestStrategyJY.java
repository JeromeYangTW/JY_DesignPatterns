package behavioral.strategy;
import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.Integer;
import java.util.List;
import java.util.ArrayList;


public class TestStrategyJY
{
	@Test
	public void Test()
	{
		/* Step 1: Test Initial State */
		PlayerJY jy = new PlayerJY( StrategyShootJY.GetInstance() );
		assertEquals( 0, jy.GetScore() );
		
		/* Step 2: Execute each strategy  */
		jy.Play();
		assertTrue( (jy.GetScore()>=0)&&(jy.GetScore()<=3) );
		
		jy.ChangeStrategy( StrategyAssistJY.GetInstance() );
		jy.Play();
		int ranges[] = { 0, 2, 3, 4, 5, 6 };
		List<Integer> list = new ArrayList<Integer>();
		for ( int i:ranges )  list.add(i);
		int score = jy.GetScore();
		assertTrue( list.indexOf(score)>-1 );
				
		jy.ChangeStrategy( StrategyDefenseJY.GetInstance() );
		jy.Play();
		assertTrue( (jy.GetScore()>=score) );
	}
}

