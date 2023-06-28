package uniqueCharaters;

import java.util.Scanner;

public class UniqueCharaters {
static Scanner sc=new Scanner(System.in);
static int flag=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		String str=sc.next();
		String validString=validateString(str);
		char[] uniqueChars=getUniqueCharacters(validString);
		display(uniqueChars);		
	}
	private static void display(char[] uniqueChars) {
		// TODO Auto-generated method stub
		if(flag==0) {
			System.out.println("no uniqueCjars existed");
		}
		else {
			for(int i=0;i<uniqueChars.length;i++) {
				
					System.out.print(uniqueChars[i]);
				
			}
		}
		
	}
	private static char[] getUniqueCharacters(String validString) {
		// TODO Auto-generated method stub
		int count=0;
		int count2=0;
		char[] uniqueChars=new char[validString.length()];
		/*
		 * for(int i=0;i<validString.length();i++) {
		 * uniqueChars[i]=validString.charAt(i); }
		 */
		char ch;
		for(int j=0;j<validString.length();j++) {
			ch=validString.charAt(j);
			for(int k=0;k<validString.length();k++) {
				if(ch!=uniqueChars[k]) {
					count++;
				}
			}
			if(count==uniqueChars.length) {
				uniqueChars[count2++]=ch;
				flag++;		
				count=0;
			}
		
		}
		return uniqueChars;
	}
	private static String validateString(String string) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < string.length(); i++) {
				char ch = string.charAt(i);
				// ascii values for uppercase and lower case letters
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
					count++;
				}
			}
			if (count != string.length() || string.length() < 3) {
				System.out.println("invalid string :plz once again enter:");
				string = sc.next();
			} else {
				isValid = false;
			}
		}
		return string;
	}

}
