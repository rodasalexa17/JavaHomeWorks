package inh;

public class Employee {
	long emplyeeId ; 
	String employeeName;  
	String employeeAddress;  
	long employeePhone ;
	double basicSalary;
	double SpecialAllownace=250.80;
	double hra =1000.50;
	double salary;
	
	Employee( long id,String eName, String Address,long phone)
	{
		this.emplyeeId=id;
		this.employeeName=eName;
		this.employeeAddress= Address;
		this.employeePhone= phone;
		
		
	}
	
	
	public double calculateSalary () {
		
		salary= basicSalary+(basicSalary * SpecialAllownace/100) +(basicSalary*hra/100);
		return salary;
	}
	
	

}
