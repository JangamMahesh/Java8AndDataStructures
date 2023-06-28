package Employee27;

import java.util.Scanner;

import ItemApplication.Validations;

public class TestApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Validations validations = new Validations();
		Employee employee = new Employee();

		System.out.println("enter the id:");
		int id = sc.nextInt();
		int validId = validations.validateId(id);
		employee.setEmpId(validId);

		System.out.println("enter the name");
		String name = sc.next();
		String validName = validations.validateString(name);
		employee.setEmpName(validName);

		System.out.println("enter the designation");
		String design = sc.next();
		String validDesign = validations.validateString(design);
		employee.setEmpDesign(validDesign);

		System.out.println("enter the department:");
		String dept = sc.next();
		String validDept = validations.validateString(dept);
		employee.setEmpDept(validDept);

//		System.out.println(employee);

	}

}
