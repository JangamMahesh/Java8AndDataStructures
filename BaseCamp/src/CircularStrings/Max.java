package CircularStrings;

import java.util.Iterator;
import java.util.Scanner;

public class Max {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter INput String");
		String inputString = sc.next();
		String output[] = getSubStrings(inputString);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]+ " ");
		}

//		while(true) {
//			System.out.println("enern umbers");
//		String b = sc.nextLine();
//		if(b.matches("^[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]{2,4}"))
//		{
//			break;
//		}
//		}
//		int r1[]=new int[5];
//		String result[] = sc.nextLine().split(" ");
//		for (int i = 0; i < result.length; i++) {
//			r1[i] =Integer.parseInt(result[i]) ;
//		}
//
//		for (int i = 0; i < r1.length; i++) {
//			System.out.println(r1[i]);
//		}

//		System.out.println("enter the size of an array");
//		int size=sc.nextInt();
//		
//		System.out.println("enter elemtnes");
//		int array[]=new int[size];
//		for(int i=0;i<size;i++) {
//			array[i]=sc.nextInt();
//			
//		}
//		int result[]=getSortedArray(array);
//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i] + " ");
//		}
//		
//	}
//
//	private static int[] getSortedArray(int[] array) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<array.length;i++)
//		{
//			int j=i-1;
//			while(j>=0 && array[j]>array[j+1])
//			{
//				int temp=array[j];
//				array[j]=array[j+1];
//				array[j+1]=temp;
//				j--;
//			}
//		}
//		return array;
	}

	private static String[] getSubStrings(String inputString) {
		// TODO Auto-generated method stub
		String output[] = new String[10];
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			String subString = "";
			for (int j = i; j < inputString.length(); j++) {
				subString += inputString.charAt(j);
				output[count++] = subString;
			}
		}
		return output;
	}

}
