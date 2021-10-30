package assignmentnt4problem5;

public class corporateHolder extends accountHolder {
	
//	+CorportateHolder(ID int, address:
//String, contact String)	
//+getContact(): String	
//+setContact(contact String): void

	public String contact;
	
	public corporateHolder(int ID, String address, String contact)
	{
		super(ID, address);
		this.contact=contact;		
	}
	
	public String getContact()
	{
		return contact;
	}
	
	public void setcontract(String contact)
	{
		this.contact=contact;
	}
}
