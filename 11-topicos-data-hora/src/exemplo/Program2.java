package exemplo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program2 {

	public static void main(String[]args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);		
		LocalDateTime nextWeekLocalDateTime = d05.minusDays(7);	
		System.out.println("Past Week LocalDate = " + pastWeekLocalDate);
		System.out.println("Next Week LocalDate = " + nextWeekLocalDate);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("Past Week Instant = " + pastWeekInstant);
		System.out.println("Next Week Instant = " + nextWeekInstant);
		
		Duration durantionTime1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));// é necessario converter LocalDate com a função atTime passando hora e minuto
		Duration durantionTime2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration durantionTime3 = Duration.between(nextWeekLocalDateTime, d05);
		
		System.out.println("Duration time = " + durantionTime1.toDays());
		System.out.println("Duration time = " + durantionTime2.toDays());
		System.out.println("Duration time = " + durantionTime3.toDays());
	}
}
