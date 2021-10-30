package assignmentnt4problem5;

public class Account {
	public accountHolder holder;//	-holder: AccountHolder
	public double balance = 0.0;//	-balance: double = 0.0
	
//	+Account(amt: double, holder: AccountHolder)
//	+withdraw: (amt: double)		
//	+deposit: (amt: double)	
//	+getBalance(): double
//	+getHolder(): AccountHolder
//	+setBalance(amt: double): void
//	+setHolder(holder: AccountHolder): void

	public Account(double amt, accountHolder holder)
	{
		balance=amt;
		this.holder=holder;
	}
	public void deposit(double amt)
	{
		balance+=amt; 
	}
	
	public void withdraw(double amt)
	{
		if(amt<balance)
		{
			balance-=amt; 
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public accountHolder getHolder()
	{
		return holder;
	}
	
	public void setBalance(double amt)
	{
		balance=amt; 
	}
	
	public void setHolder(accountHolder holder)
	{
		this.holder=holder;
	}
	
}
