package programa;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Teste1 {

	public static void main(String[] args) {
	
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); // greewich
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2025, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2025, 7, 20, 1, 30);
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);
				
		System.out.println();

	}

}
/*
d01: 2025-09-19
d02: 2025-09-19T10:12:44.880558801
d03: 2025-09-19T13:12:44.880591383Z
d04: 2022-07-20
d05: 2022-07-20T01:30:26
d06: 2022-07-20T01:30:26Z
d07: 2022-07-20T04:30:26Z
d08: 2022-07-20
d09: 2022-07-20T01:30
d10: 2025-07-20
d11: 2025-07-20T01:30




------------------------------------
padrão iso 8601



*/
