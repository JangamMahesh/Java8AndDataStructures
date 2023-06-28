package functionalInterfaces;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.sql.Date;

public class DateTimeApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// old date give extra info like time and country
		Date olddate = new Date(0);
		
		System.out.println(olddate);

		// its specic to date
		LocalDate d = LocalDate.now();
		Date valueOf = Date.valueOf(d);
		System.out.println(valueOf.toLocalDate());
		System.out.println(valueOf.toLocaleString());
		
		System.out.println();
		Date date = new Date(2023,01,01);
		System.out.println(date);
		Date date2=new Date(2022,02,02);
		System.out.println(date2);
		
		
		
		System.out.println(d);
		LocalDate d1 = LocalDate.of(1998, Month.AUGUST, 28);
		System.out.println(d1);
		
		Period between = Period.between(d, d1);
		System.out.println(between);
		System.out.println(between.getMonths());
		System.out.println(between.getDays());
		

		LocalTime t = LocalTime.now();
		System.out.println(t);

		/*
		 * for (String string : ZoneId.getAvailableZoneIds()) {
		 * 
		 * System.out.println(string); }
		 */

		// machine readable form
		Instant i = Instant.now();
	
		System.out.println(i.MAX);
		System.out.println(i.MIN);

		LocalDateTime dt = LocalDateTime.now(ZoneId.of("Australia/Hobart"));
		System.out.println(dt);

	}
}
