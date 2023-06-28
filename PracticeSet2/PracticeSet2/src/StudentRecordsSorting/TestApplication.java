package StudentRecordsSorting;

import java.util.Scanner;

import ItemApplication.Validations;

public class TestApplication {
	static int flag = 1;
	static Scanner sc = new Scanner(System.in);
	static Validations validation = new Validations();

	public static void main(String[] args) {
//		1. Create Student Record
//		2. Display Student Names in sorted order based on branch (alphabetical order)
//		3. Display Student ID in ascending sorted order
		Student student[] = createStudentRecord();
		int op;
		do {
			System.out.println(
					"\nchoose an option:\n1.Display Student Names in sorted order based on branch\n2.Display Student ID in ascending sorted order\n3.EXIT\n");
			System.out.println("enter option:");
			op = sc.nextInt();
			switch (op) {
			case 1:
				Student branchName[] = branchSorting(student);
				for (int i = 0; i < student.length; i++) {
					System.out.println(student[i]);
				}
				break;
			case 2:
				Student studentId[] = idSorting(student);
				for (int i = 0; i < student.length; i++) {
					// System.out.println(student[i]);
					System.out.println("[Student Id:" + student[i].getStudentId() + ", Student Name:"
							+ student[i].getStudentName() + ", Student Branch:" + student[i].getStudentBranch() + "]");
				}
				break;
			case 3:
				break;
			default:
				System.out.println("\nInvalid option:");

			}
		} while (op != 3);

	}

	// id sorting
	private static Student[] idSorting(Student[] student) {
		// bubble sort
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - i - 1; j++) {
				if (student[j].getStudentId() > student[j + 1].getStudentId()) {
					Student temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;
				}
				/*else
				{
					nameSorting(student);
				}*/
				
			}
		}
		return student;
	}

	private static Student[] nameSorting(Student[] student) {
		// bubble sort
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - i - 1; j++) {
				if (student[j].getStudentName().compareToIgnoreCase(student[j + 1].getStudentName()) > 0) {
					Student temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;

				}
			}

		}

		return student;
	}

//branch sorting
	private static Student[] branchSorting(Student[] student) {
		// bubble sort
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - i - 1; j++) {
				if (student[j].getStudentBranch().compareToIgnoreCase(student[j + 1].getStudentBranch()) > 0) {
					Student temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;

				} else {
					nameSorting(student);
				}
			}
		}
		/*
		 * if(flag==1) { nameSorting(student); }
		 */
		return student;
	}

//	1. Create Student Record
	private static Student[] createStudentRecord() {
		System.out.println("enter number of students:");
		int number = sc.nextInt();
		int validNumber = validation.validateId(number);
		Student students[] = new Student[validNumber];
		for (int i = 0; i < students.length; i++) {
			System.out.println("enter id ,name and branch:");
			long id = sc.nextLong();
			long validId = validation.validateLong(id);
			String name = sc.next();
			String validName = validation.validateString(name);
			String branch = sc.next();
			String validBranch = validation.validateString(branch);
			Student student = new Student(validId, validName, validBranch);
			students[i] = student;
		}
		return students;
	}

}
