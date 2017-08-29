package inh;

public class Manager extends Employee {
	
	Manager(long id, String eName, String Address, long phone) {
		super(id, eName, Address, phone);
		// TODO Auto-generated constructor stub
		
		
	}
	
	Manager(long id, String eName, String Address, long phone,double sal)
	{
		super(id, eName, Address, phone);
		// TODO Auto-generated constructor stub
		super.basicSalary=sal;
	}


}
