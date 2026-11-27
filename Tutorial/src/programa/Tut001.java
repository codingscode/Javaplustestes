
package programa;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador dia/mes/ano hora:minuto:segundo:nanosegundos
        //DateTimeFormatter formatadorGmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);
        //DateTimeFormatter formatadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		
		// Converter entre offsets diferentes
		
		OffsetDateTime emUtc = OffsetDateTime.parse("2026-11-27T13:18:15.2000Z");
		
		OffsetDateTime emBrasilia = emUtc.withOffsetSameInstant(ZoneOffset.of("-03:00"));
		// Resultado: 2026-11-27T10:18:00-03:00

		System.out.println(emUtc);
		System.out.println(formatador.format(emUtc));
		
		System.out.println(emBrasilia);
		System.out.println(formatador.format(emBrasilia));

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
2026-11-27T13:18:15.200Z
27/11/2026 13:18:15.200
2026-11-27T10:18:15.200-03:00
27/11/2026 10:18:15.200
--------------------------
tempo execução em ns: 18032931










 
 
*/
