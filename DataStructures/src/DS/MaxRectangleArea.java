package DS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class MaxRectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int matrix[] = new int[r];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = sc.nextInt();
		}
		int maxArea = getMaxRectangleArea(matrix);
		System.out.println("Max area " + maxArea);}

	private static int getMaxRectangleArea(int[] matrix) {
		// TODO Auto-generated method stub
		int maxArea = 0;
		int left[] = new int[matrix.length];
		int right[] = new int[matrix.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < matrix.length; i++) {
			if (stack.empty()) {
				left[i] = 0;
				stack.push(i);
			} else {
				while (!stack.empty() && matrix[stack.peek()] >= matrix[i]) {
					stack.pop();
				}
				left[i] = stack.empty() ? 0 : stack.peek() + 1;
				stack.push(i);
			}
		}
		while (!stack.empty()) {
			stack.pop();
		}

		for (int i = matrix.length - 1; i > 0; i--) {

			if (stack.empty()) {
				right[i] = matrix.length - 1;
				stack.push(i);
			}
			else {
				while (!stack.empty() && matrix[stack.peek()] >= matrix[i]) {
					stack.pop();
				}
				right[i] = stack.empty() ? 0 : stack.peek() - 1;
				stack.push(i);
			}
		}
		for (int i = 0; i < matrix.length; i++) {

			maxArea = max(maxArea, matrix[i] * (right[i] - left[i] + 1));
		}

		return maxArea;
	}

	private static int max(int maxArea, int i) {
		// TODO Auto-generated method stub
		return maxArea > i ? maxArea : i;
	}

}
