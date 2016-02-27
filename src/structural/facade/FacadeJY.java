package structural.facade;


public class FacadeJY
{
	public int amount;
	public FacadeJY() {}
	
	public void DoCalculate()
	{
		SubsysAJY sysa = new SubsysAJY();
		sysa.DoCalculate();
		SubsysBJY sysb = new SubsysBJY();
		sysb.DoCalculate();
		
		amount = sysa.amount+sysb.amount;
	}
}

