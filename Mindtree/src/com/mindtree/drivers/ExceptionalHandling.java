package com.mindtree.drivers;

import java.lang.Exception;
import java.util.Scanner;

public class ExceptionalHandling {


	public static void main(String[] args)/* throws ArrayIndexOutOfBoundsException */ {
		// TODO Auto-generated method stub
		int a =-1;
		int b = 2;
		int arr[] = new int[2];

		try ( Scanner sc = new Scanner(System.in))
		{
			if(a<0) {
			throw new MyException("error");
			}
			//System.out.println(b/a);
		}
		
		catch (MyException e) {
			System.out.println(e);
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}*/
		/*catch(Exception e) {
			System.out.println(e);
		}*/
		finally {
			System.out.println("bye");
		}
	}
}

class MyException extends Exception {
	public MyException(String str) {
		super(str);
	}
}

