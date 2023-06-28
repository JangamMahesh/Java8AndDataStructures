package practice;
import java.util.Scanner;
public class Date 
{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-gSenerated method stub
System.out.println("enter date");
String date=checkingDoE(sc.next());
}
	public static String checkingDoE(String doE) {
	boolean isValid = true;
	while (isValid) {
	String year = "";
	String actualDate = "";
	String currentDate = "05-01-2021";
	String DoE = "";
	DoE += doE.charAt(0);
	DoE += doE.charAt(1);
	// adding date to the string
	DoE += doE.charAt(2); // adding month to string
	DoE += doE.charAt(3);
	DoE += doE.charAt(4); // adding - to string
	DoE += doE.charAt(5); // year appending to reverseDob
	for (int i = 6; i < 10; i++) {
	DoE += doE.charAt(i);
	}
	if (DoE.compareTo(currentDate)<0) {
	isValid = false;
	} else {
				System.out.println("it must be past date:plz once again enter\n");
			System.out.println("enter date of birth:(dd-mm-yyyy)");
				doE = sc.next();

			}

		}
		return doE;

	}
}
