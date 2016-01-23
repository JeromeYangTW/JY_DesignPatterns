package creational.singleton;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestSingletonJY {

	@Test
	public void Test()
	{
		SingletonJY s1 = SingletonJY.GetInstance();
		assertNotNull( s1 );
		SingletonJY s2 = SingletonJY.GetInstance();
		assertNotNull( s2 );
		
		assertEquals( s1, s2 );
	}
}

