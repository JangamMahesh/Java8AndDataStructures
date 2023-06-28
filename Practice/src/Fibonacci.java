import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
	
	private int a;
	private String b;
	

	public Fibonacci(int x, String y) {
		super();
		this.a = x;
		this.b = y;
	}

	public int getA() {
		return a;
	}

	public void setA(int x) {
		this.a = x;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	static List<Integer> list = new ArrayList();

	public static void main(String[] args) {
		String s="X|M|XL";
		
	String[] split = s.split("|");
	String vowels = "a::b::c::d:e";

    // splitting the string at "::"
    // storing the result in an array of strings
    String[] result = vowels.split("::");
	 System.out.println("result = " + Arrays.toString(split));
	 System.out.println("result = " + Arrays.toString(result));
	for (String string : split)
	{
	System.out.println(string);	
	}
		Fibonacci name = new Fibonacci(1,"one");
		System.out.println(name.a +" " +name.b);
		
		name.setA(12);
		System.out.println(name.a +" " +name.b);
		
		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(getFibonacciOfLength(i));
		}

		
	}

	private static int getFibonacciOfLength(int n) {

		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;

		return getFibonacciOfLength(n - 1) + getFibonacciOfLength(n - 2);

	}

}
