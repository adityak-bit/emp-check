package employee;

public class EmpWageBuilderUC1 {
	public static void main(String[] args) {
		//CONSTANTS//
		int IS_FULL_TIME = 1;
		//COMPUTATION//
		double emp_check = (Math.floor(Math.random()*10))%2;
		if(emp_check == IS_FULL_TIME)
			System.out.println("employee is present");
		else
			System.out.println("emplohyee is absengt");
	}

}
