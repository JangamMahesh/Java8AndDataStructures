
public class LCMANDGCD{

	public static void main(String[] args) {

		int o = 10;
		Integer k = o;
		int parseInt = Integer.parseInt("123");
		String binaryString = Integer.toBinaryString(parseInt);

		int parseInt2 = Integer.parseInt(binaryString, 2);

		System.out.println(parseInt2);
		int[] arr = { 2, 4, 6, 5, 7 };

		int gcd = getGCD(arr);
		System.out.println("GCD " + gcd);

		int lcm = getLCM(arr, gcd);
		System.out.println("LCM " + lcm);

	}

	private static int getGCD(int[] arr) {

		if (arr.length == 0) {
			return 0;
		}
		int result = arr[0];
		for (int i = 0; i < arr.length; i++) {
			result = gcd(result, arr[i]);
		}
		return result;
	}

	private static int gcd(int a, int b) {

		if (a == 0) {
			return b;
		}

		return gcd(b % a, a);
	}

	private static int getLCM(int[] arr, int gcd) {

		int sum = 1;
		for (int i = 0; i < arr.length; i++) {
			sum *= arr[i];
		}

		return sum / gcd;
	}

}
