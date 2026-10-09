package programa;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;



public class Teste1 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		
				
		System.out.println();

	}

}
/*
d01: 2025-09-19
d02: 2025-09-19T09:58:45.872096713
d03: 2025-09-19T12:58:45.872149658Z
d04: 2022-07-20
d05: 2022-07-20T01:30:26
d06: 2022-07-20T01:30:26Z
d07: 2022-07-20T04:30:26Z


------------------------------------
padrão iso 8601



*/
