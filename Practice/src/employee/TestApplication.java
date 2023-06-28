package employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static List<Employee> list = new ArrayList<>();
	static Iterator iterator = list.iterator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(TestApplication.class.getClassLoader());
		System.out.println(System.class.getClassLoader());

		System.out.println("enter number of employees");
		int size = sc.nextInt();
		String validId = "";
		for (int i = 0; i < size; i++) {
			System.out.println("enter name");
			String name = sc.nextLine() + sc.next();
			System.out.println("enter Emp Id");
			String id = sc.next();
			if (i > 0) {
				validId = getUniqueId(id, i);
			} else {
				validId = id;
			}
			list.add(new Employee(validId, name));
		}
		try {

			display();

		} catch (RuntimeException e) {
			throw new Employee("Not found");
		}

	}

	private static void display() {
		// TODO Auto-generated method stub
		System.out.println("EMpolyee deatails");
		for (Employee e : list) {
			System.out.println("Employee [empId=" + e.getEmpId() + ", empName=" + e.getEmpName() + "]");
		}
	}

	private static String getUniqueId(String id, int i) throws Employee  {
		// TODO Auto-generated method stub
		boolean isValid = true;
		boolean flag = false;
		while (isValid) {
			for (Employee e : list) {
				if (e.getEmpId().equalsIgnoreCase(id)) {
					flag = true;
				}
			}
			try {
				if (flag) {
					System.out.println("Sorry ! the provided Id alredy Existe Please enter new one ");
					id = sc.next();
					flag = false;}
				else {
					isValid = false;
				}

			} catch (RuntimeException e) {
				throw new Employee("Not found");
			}
			 
		}

		return id;
	}

}
