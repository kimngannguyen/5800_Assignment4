package assignmentnt4problem5;

import java.util.*;

public class individualHolder extends accountHolder{
//	-name: String
//	-SSN: String
//	+IndividualHolder(ID int, address:
//	String, name String, String SSN)
//	+getName(): String
//	+getSSN(): String
//	+setName(name String): void
//	+setSSN(SSN String): void

	public String name;
	public String SSN;
	
	public individualHolder(int ID, String address, String name, String ssn) 
	{
		super(ID, address);
		this.name=name;
		this.SSN=ssn;	
	}
	
	public String getName()
	{
		return name;
	}
	public String getSSN()
	{
		return SSN;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSSN(String ssn)
	{
		this.SSN=ssn;
	}
	
}
