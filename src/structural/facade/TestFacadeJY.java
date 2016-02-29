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
		SubsysAJY ajy = SubsysAJY.GetInstance();
		ajy.DoCalculate();
		SubsysBJY bjy = SubsysBJY.GetInstance();
		bjy.DoCalculate();		
		assertEquals( fjy.amount, SubsysAJY.amount+SubsysBJY.amount );
		
		ClientJY cjy = new ClientJY();
		cjy.DoCalculate();
		assertEquals( cjy.amount, SubsysAJY.amount+SubsysBJY.amount );
	}
}

