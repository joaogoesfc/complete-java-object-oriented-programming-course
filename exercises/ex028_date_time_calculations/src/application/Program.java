package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-02-25");
		LocalDateTime d05 = LocalDateTime.parse("2024-02-25T01:30:26");
		Instant d06 = Instant.parse("2024-02-20T01:30:26Z");

		LocalDate lastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("------d04 default = " + d04 + "-----------");
		System.out.println("lastWeekLocalDate = " + lastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println();
		
		LocalDateTime lastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("----------d05 default = " + d05 + "-----------");
		System.out.println("lastWeekLocalDateTime = " + lastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println();
		
		Instant lastWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		System.out.println("lastWeekInstant = " + lastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println();
		
		Duration t1 = Duration.between(lastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
		Duration t2 = Duration.between(lastWeekLocalDateTime, d05);

		System.out.println("t1 days = " + t1.toDays());
		System.out.println("t2 days = " + t2.toDays());
	}
}
