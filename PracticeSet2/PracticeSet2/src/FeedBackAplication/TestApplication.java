package FeedBackAplication;
import java.util.Scanner;
import ItemApplication.Validations;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static Validations validation = new Validations();

	public static void main(String[] args) {

		// create array of customers
		// and storing their details in to array
		// taking feedback as input and displaying them

		System.out.println("enter no of customers:");
		int number = sc.nextInt();
		int validNumber = Validations.validateId(number);
		Customer customer[] = createCustomers(validNumber);
		//displaying feedbacks of the customers
		for(int i=0;i<customer.length;i++)
		{
			System.out.println(customer[i]);
		}
	}

	// create array of customers
	private static Customer[] createCustomers(int validNumber) {
		Customer customers[] = new Customer[validNumber];
		for (int i = 0; i < validNumber; i++) {
			System.out.println("===enter customer details===" + (i + 1));
			System.out.println("enter name of the customer");
			String name = sc.next();
			String validName = validation.validateString(name);

			System.out.println("enter mobile no of the customer");
			String mno = sc.next();
			String validMno = validation.validatemobileNumber(mno);

			System.out.println("enter feedback");
			double feedback = sc.nextDouble();
			double validFb = validation.validateFeedback(feedback);
			
			Customer customer = new Customer(validName, validMno, validFb);
			customers[i] = customer;
		}
		return customers;
	}

}
