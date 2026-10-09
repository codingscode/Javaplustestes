package programa;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;




public class Teste1 {

	public static void main(String[] args) {
	
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println("d06 = " + fmt5.format(d06));
		
		System.out.println();

	}

}
/*
d04 = 20/07/2022
d04 = 20/07/2022
d04 = 20/07/2022
d05 = 20/07/2022
d05 = 20/07/2022 01:30
d06 = 19/07/2022 22:30
d05 = 2022-07-20T01:30:26
d06 = 2022-07-20T01:30:26Z




------------------------------------
padrão iso 8601



*/
