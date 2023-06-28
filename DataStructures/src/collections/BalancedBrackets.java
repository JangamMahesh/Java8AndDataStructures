package collections;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	static Scanner sc = new Scanner(System.in);
	static Stack<Character> stack = new Stack();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the String");
		String str = sc.next();
		boolean isBalanced = isBalancedString(str);
		if (isBalanced) {
			System.out.println("balanced string");
		} else {
			System.out.println("unbalanced String");
		}

	}

	private static boolean isBalancedString(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {

					char ch = stack.peek();
					System.out.println(ch);
					/*
					 * switch (c) { case ')': if (ch == '}' || ch == ']') { return false; } break;
					 * 
					 * case '}': if (ch == ')' || ch == ']') { return false; } break;
					 * 
					 * case ']': if (ch == ')' || ch == '}') { return false; } break;
					 * 
					 * }
					 */
					 
	                    if(c==')' && ch!='(')
	                    {
	                        return false;
	                    }
	                    else if(c=='}' && ch!='{')
	                   {
	                       return false;
	                   }
	                   else if(c==']' && ch!='[')
	                   {
	                       return false;
	                   }
	                   else if(c==')' && ch=='(')
	                   {
	                      System.out.println(stack.pop());
	                   }
	                   else if(c=='}' && ch=='{')
	                   {
	                      System.out.println(stack.pop());
	                   }
	                   else if(c==']' && ch=='[')
	                   {
	                      System.out.println(stack.pop());
	                   }        

				}

			}
		}
		return (stack.isEmpty());
	}

}
