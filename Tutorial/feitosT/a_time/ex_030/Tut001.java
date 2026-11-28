
package programa;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador dia/mes/ano hora:minuto:segundo:nanosegundos
        //DateTimeFormatter formatadorGmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);
        //DateTimeFormatter formatadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        
		//DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		
		// ISO 8601
		// Data e hora com deslocamento (OffsetDateTime)
		OffsetDateTime comOffset = OffsetDateTime.now();
		
		String formatado = comOffset.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

		OffsetDateTime lido = OffsetDateTime.parse("2026-11-27T23:31:00-03:00");
		
		
        System.out.println(comOffset);
        System.out.println(formatado);
        System.out.println(lido);
		

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
2026-11-27T23:41:53.982623098-03:00
2026-11-27T23:41:53.982623098-03:00
2026-11-27T23:31-03:00
--------------------------
tempo execução em ns: 38426658







 
 
*/
