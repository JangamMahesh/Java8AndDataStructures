package practice;

import java.util.Iterator;
import java.util.Scanner;
/*
1
3*2
4*5*6
10*9*8*7
1
3*2
4*5*6
10*9*8*7
11*12*13*14*15
*/
public class Pattern {

	public static void main(String[] args) {

		System.out.println("enter a positive integer");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int c=1;
		
		for (int i = 1; i <= n; i++) {
			int c1=c+i-1;
			for (int j = 1; j <=i; j++) {
				if(i==1)
				{
					System.out.print(1);
					c++;
				}
				else {
				if(i%2==0 )
				{
					if(j<i) {
					System.out.print(c1--+"*");
					c++;
					}
					else
					{
						System.out.print(c1--);
						c++;
					}
				}
				else
				{
					if(j<i)
					{
					System.out.print(c++ +"*");//c=2
					}
					else
					{
						System.out.print(c++);
					}
				}
				}
			}
			System.out.println();
		}
		
	}

}
