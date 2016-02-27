package structural.facade;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestFacadeJY
{
	@Test
	public void Test()
	{
		FacadeJY fjy = new FacadeJY();
		fjy.DoCalculate();
		int a = fjy.amount;
		
		SubsysAJY ajy = new SubsysAJY();
		ajy.DoCalculate();
		int b = ajy.amount;
		SubsysBJY bjy = new SubsysBJY();
		bjy.DoCalculate();
		int c = bjy.amount;
		
		assertEquals( a, b+c );
	}
}

