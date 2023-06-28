package practice;
// default : accessible in any class of same package
// private : accessible only in one class in which it is declared
//protected : accessible in any class of same package and accessible in other package if it is inherited from the another package
// public : accessible in any package and class
// if we access variable with same name as parent & child with parent reference then parent class value will be returned
// if we call method with parent class reference child class method will be called.
class MyAccess {
	// default access variable
	 int myData=5;
	// default access constructor
	MyAccess(int data) {
		myData = data;
	}
	MyAccess(){;
	}
	// A default access method that return myData
	int getMyData() {
		return myData;
	}
}
class D extends MyAccess{

	int myData=10;
	D(int data) {
		super(data);	
	}
	D()
	{
		
	}
	int getMyData() {
		return myData;
	}
	
}
public class AccessSpecifiers {
	public static void main(String args[]) {
		
	MyAccess m=new D();
	System.out.println(m.myData);
	System.out.println(m.getMyData());
	
	D m1=new D();
	System.out.println(m1.myData);
	System.out.println(m1.getMyData());
		
		MyAccess obj = new MyAccess(25);
		System.out.println("The value of myData by variable : " + obj.myData);
		System.out.println("The value of myData by method : " + obj.getMyData());
	}
}