
package programa;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Converter UTC para um fuso horário local

		
		// formatador ano/mes/dia hora:minuto:segundo:nanosegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);

		Instant utc = Instant.parse("2024-10-14T01:42:00Z");
		ZonedDateTime aqui = utc.atZone(ZoneId.of("America/Fortaleza"));
		
		System.out.println(utc);
		System.out.println(aqui);
        
		
        

		System.out.println("--------------------------");
		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime);

		// milliseconds
		System.out.print("tempo execução em ns: ");
		System.out.println(duration);
	}

}

/*
2024-10-14T01:42:00Z
2024-10-13T22:42-03:00[America/Fortaleza]
--------------------------
tempo execução em ns: 34517648










 
 
*/
