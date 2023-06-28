package practice;

import java.util.Scanner;

public class Ratio {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// validate time

		// String time = validateTime(sc.next());
		// System.out.println(time);

		float male = (float) (3 / 2) * 100;
		System.out.println(male);
	}

	public static String validateTime(String time) {
		while (!time.matches("([01][0-9]|2[0-3]):([0-5][0-9])$")) {
			System.out.println("entered time is invalid.once again enter the time in HH:MM format");
			time = sc.next();
		}
		return time;
	}

}
