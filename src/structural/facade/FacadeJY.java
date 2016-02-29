package structural.facade;


public class FacadeJY
{
	public int amount;
	public FacadeJY() {}
	
	public void DoCalculate()
	{
		SubsysAJY sysa = SubsysAJY.GetInstance();
		sysa.DoCalculate();
		SubsysBJY sysb = SubsysBJY.GetInstance();
		sysb.DoCalculate();
		
		amount = SubsysAJY.amount+SubsysBJY.amount;
	}
}

