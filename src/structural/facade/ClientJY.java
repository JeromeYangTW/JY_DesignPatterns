package structural.facade;


public class ClientJY
{
	/* Client only knows the existence of FacadeJY */
	public int amount;
	public ClientJY() {}
	
	public void DoCalculate()
	{
        FacadeJY fjy = new FacadeJY();
        fjy.DoCalculate();
		amount = fjy.amount;
	}
}

