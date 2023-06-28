
public class BinaryString {

	public static String addBinary(String a, String b) {
		int i = a.length() - 1;
		int j = b.length() - 1;
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += a.charAt(i) - '0';
			}
			if (j >= 0) {
				sum += b.charAt(j) - '0';
			}
			sb.append(sum % 2);
			carry = sum / 2;
			i--;
			j--;
		}
		if (carry != 0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {

		
		String s1 = new String("hello");
		String s2 = "hello";
		// intern method used to get from heap memory if it exists
		String s4 = new String("hello").intern();
		String s3 = s1.intern();// returns string from pool, now it will be same as s2
		System.out.println(s1 == s2);// false because reference variables are pointing to different instance
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(addBinary("11", "1"));

	}

}
