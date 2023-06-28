package angleBetweenHrHandandMinHand;

import java.util.Scanner;

/*Write a program to calculate the angle between the hour hand and the minute hand of a clock if the time is given in a string format. 
For example if the time is given as 12:15 the output should be 90 degrees.*/
public class AngleBetweenHrHandAndMinHand {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter string in the format of hour:minutes");
		String time = sc.next();
		String validTime = validateTime(time);
		int angle = getAngle(validTime);
		System.out.println("angle between hour hand and minute hand:" + angle);

	}

	// get an angle
	private static int getAngle(String validTime) {
		String hour = "";
		hour += validTime.charAt(0);
		hour += validTime.charAt(1);
		// get hour in integer
		int hr = getInt(hour);
		// minute
		String minute = "";
		minute += validTime.charAt(3);
		minute += validTime.charAt(4);
		// get minute in integer
		int min = getInt(minute);
		// calculate the position of the hour
		/* int hourHandDegree = hr * (360 / 12) + (min * 360) / (12 * 60); */
		int hourHandDegree = (hr + (min / 60)) * 30;
		/* System.out.println(hourHandDegree); */
		// calculate the position of minute hand
		int minHandDegree = min * 6;
		/* System.out.println(minHandDegree); */
		// calculate the angle difference
		System.out.println(hourHandDegree);
		System.out.println(minHandDegree);
		int angle = (int) (hourHandDegree - minHandDegree);
		if(angle<0) {
			angle=angle*(-1);
		}
		System.out.println(angle);
		if(angle>180) {
			angle=360-angle;
		}
		/*
		 * int angle = (hourHandDegree > minHandDegree) ? (hourHandDegree -
		 * minHandDegree) : (minHandDegree - hourHandDegree); if (angle > 180) { angle =
		 * 360 - angle;
		 */

		return angle;
	}

	// convert string in to integer
	private static int getInt(String hour) {
		char charArray[] = new char[hour.length()];
		for (int i = 0; i < hour.length(); i++) {
			charArray[i] = hour.charAt(i);
		}
		int sum = 0;
		// ascii value for zero
		int zeroAscii = (int) '0';
		for (char c : charArray) {
			int ascii = (int) c;
			sum = (sum * 10) + (ascii - zeroAscii);
		}
		return sum;
	}

	// validate time
	private static String validateTime(String time) {
		while (!time.matches("([0][1-9]|[1][0-2]):(0[0-9]|[1-5][0-9])$")) {
			System.out.println("entered time is invalid.once again enter the time in HH:MM format");
			time = sc.next();
		}
		return time;
	}

}
