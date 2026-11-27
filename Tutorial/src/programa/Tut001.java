
package programa;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador dia/mes/ano hora:minuto:segundo:nanosegundos
        //DateTimeFormatter formatadorGmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);
        //DateTimeFormatter formatadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		
		// Fazer parse e formatar com offset (ISO-8601)
		
		OffsetDateTime parsed = OffsetDateTime.parse("2026-11-27T10:18:00-03:00");

		String isoFormatado = parsed.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        System.out.println(parsed);
        
        System.out.println(isoFormatado);
		

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
2026-11-27T10:18-03:00
2026-11-27T10:18:00-03:00
--------------------------
tempo execução em ns: 18063591






 
 
*/
