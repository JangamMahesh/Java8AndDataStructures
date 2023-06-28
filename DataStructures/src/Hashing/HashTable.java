package Hashing;

public class HashTable {
	private HashNode[] buckets;
	private int numOfbuckets;
	private int size;

	public HashTable(int capacity) {
		this.numOfbuckets = capacity;
		this.buckets = new HashNode[numOfbuckets];
		this.size = 0;

	}

	public int size() {
		return size;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void put(Integer key, String value) {
		if (key == null || value == null) {
			throw new IllegalArgumentException("waste");
		}
		int bucketIndex = getIndex(key, numOfbuckets);
		HashNode head = buckets[bucketIndex];
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HashNode node = new HashNode(key, value);
		node.next = head;
		buckets[bucketIndex] = node;
	}
	private int getIndex(Integer key, int size2) {
		// TODO Auto-generated method stub
		return key % size2;
	}

	public String get(Integer key) {
		return null;
	}

	private static class HashNode {
		private Integer key;
		private String value;
		private HashNode next;

		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable h = new HashTable(10);
		h.put(21, "mahesh");
		h.put(30, "raj");
		h.put(31, "sdfk");
		System.out.println(h.size());
		System.out.println(h.remove(31));

		System.out.println(h.remove(21));
		System.out.println(h.size());

	}

	private String remove(int i) {
		// TODO Auto-generated method stub
		int buttonIndex = getIndex(i, numOfbuckets);
		HashNode head = buckets[buttonIndex];
		HashNode previous = null;
		while (head != null) {
			if (head.key.equals(i)) {
				break;
			}
			previous = head;
			head = head.next;
		}
		size--;
		if (head == null) {
			return null;
		}
		if (previous != null) {
			previous.next = head.next;
		} else {
			buckets[buttonIndex] = head.next;
		}
		return head.value;

	}

}
