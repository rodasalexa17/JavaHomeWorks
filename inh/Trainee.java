package inh;

public class Trainee extends Employee {
	Trainee(long id, String eName, String Address, long phone)
	{
		super(id, eName, Address, phone);
		// TODO Auto-generated constructor stub
	}
	
	
	Trainee(long id, String eName, String Address, long phone,double sal)
	{
		super(id, eName, Address, phone);
		// TODO Auto-generated constructor stub
		super.basicSalary=sal;
	}
	

}