package inh;
public class InheritanceActivitty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mng =new Manager(3567, "jack", "Brown", 3500,6500);
		mng.calculateSalary();
		System.out.println("The managers salary is " + mng.salary);

		Trainee tr =new Trainee(123456, "Mary", "Trump", 2550,1523);
		tr.calculateSalary();
		System.out.println("The Trainee salary is " + tr.salary);
	}

	}

