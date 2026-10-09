package programa;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Teste1 {

	public static void main(String[] args) {
	
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate semanapassada = d04.minusDays(7);
		LocalDate semanaproxima = d04.plusDays(7);
		
		System.out.println("semanapassada: " + semanapassada);
		System.out.println("semanaproxima: " + semanaproxima);
		
		LocalDateTime semanapassada2 = d05.minusDays(7);
		LocalDateTime semanaproxima2 = d05.plusDays(7);
		System.out.println("semanapassada2: " + semanapassada2);
		System.out.println("semanaproxima2: " + semanaproxima2);
		
		Instant semanapassada3 = d06.minus(7, ChronoUnit.DAYS);
		Instant semanaproxima3 = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("semanapassada3: " + semanapassada3);
		System.out.println("semanaproxima3: " + semanaproxima3);
		
		Duration t1 = Duration.between(semanapassada2, d05);
		System.out.println("t1 dias = " + t1.toDays());
		
		System.out.println();

	}

}
/*
semanapassada: 2022-07-13
semanaproxima: 2022-07-27
semanapassada2: 2022-07-13T01:30:26
semanaproxima2: 2022-07-27T01:30:26
semanapassada3: 2022-07-13T01:30:26Z
semanaproxima3: 2022-07-27T01:30:26Z
t1 dias = 7




------------------------------------
padrão iso 8601



*/
