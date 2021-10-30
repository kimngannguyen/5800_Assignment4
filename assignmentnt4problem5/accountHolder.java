package assignmentnt4problem5;

import java.util.*;
import java.util.Random;

public class accountHolder {
	public int ID; 
	public String address; 
	
	public accountHolder(int ID, String address)
	{
		ID=this.ID;
		address=this.address;
	}
	public int nextID()
	{
		return new Random().nextInt(1000000);
	}
}
