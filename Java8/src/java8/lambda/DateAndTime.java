package java8.lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		
		LocalDate date1 = LocalDate.of(2023, Month.FEBRUARY, 1);
		LocalDate minusDays = date.minusDays(10);
		System.out.println(minusDays);
		System.out.println(date);
		System.out.println(date.isAfter(date1));
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getEra());
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getSecond());
		System.out.println(time.getNano());

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		LocalDateTime dt1 = LocalDateTime.of(1995, Month.APRIL, 28, 12, 45);
		System.out.println(dt1);
		LocalDateTime dt11 = LocalDateTime.of(1995, 04, 28, 12, 45);
		System.out.println(dt11);
		System.out.println("After six months " + dt11.plusMonths(6));
		System.out.println("Before six months: " + dt.minusMonths(6));
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1989, 06, 15);
		System.out.println(birthday);
		Period p = Period.between(birthday, today);
		System.out
				.println("age is %d year %d months %d days " + p.getYears() + " " + p.getMonths() + " " + p.getDays());

		Year y = Year.of(1909);
		if (y.isLeap())
			System.out.printf("%d is Leap year", 1909);
		else
			System.out.printf("%d is not Leap year", 1909);
		
		
		//List.stream().map().collect(Collectors.toMap(Map.Entry.comparingByValue(), (e1, e2)-> e1,LinkedList::new)));
	}
}
