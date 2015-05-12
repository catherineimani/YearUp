
public class Account 
{
	public int m_accountid = -1;
	public String m_accountName;
	public int m_customerid = -1;
	public double m_amount = 0.0;

	public Account (int accountid, String accountName, int customerid)
	{
		m_accountid = accountid;
		m_accountName = accountName;
		m_customerid = customerid;
	}
	
	private void UpdateAccount (double newAmount)
	{
		m_amount = newAmount;
	}
	
	public void UpdateAmountSecurely (double newAmount, String password)
	{
		if (password != null)
		{
			if (password.equals("admin"))
			{
				UpdateAccount(newAmount);
				System.out.println("Update amount in account ID " + m_accountid + " to " + m_amount);
			}
			
			else 
			{
				System.out.println ("Call the police! Unsecure Access!");
			}
		}
	}
}