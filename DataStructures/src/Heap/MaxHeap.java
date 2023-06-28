package Heap;

import java.util.Scanner;

public class MaxHeap {

	private int[] heap;
	private int n = 0;

	public MaxHeap(int i) {
		// TODO Auto-generated constructor stub
		heap = new int[i + 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MaxHeap h = new MaxHeap(4);

		h.insert(4);
		h.insert(1);
		h.insert(3);
		h.insert(6);
		h.insert(2);
		h.insert(-1);
		h.insert(10);
		for (int i = 1; i < h.heap.length; i++) {
			System.out.print(h.heap[i] + " ");
		}

	}

	private void insert(int i) {
		// TODO Auto-generated method stub
		if (n == heap.length - 1) {
			resize(2 * heap.length);

		}

		n++;
		heap[n] = i;
		swim(n);

	}

	private void swim(int i) {
		// TODO Auto-generated method stub
		while (i > 1 && heap[i / 2] < heap[i]) {
			int temp = heap[i / 2];
			heap[i / 2] = heap[i];
			heap[i] = temp;
			i = i / 2;
		}

	}

	private void resize(int i) {
		// TODO Auto-generated method stub
		int[] temp = new int[i];
		for (int j = 0; j < heap.length; j++) {
			temp[j] = heap[j];
		}
		heap = temp;
	}

}
