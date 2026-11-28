
package programa;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador dia/mes/ano hora:minuto:segundo:nanosegundos
        //DateTimeFormatter formatadorGmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);
        //DateTimeFormatter formatadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        
		//DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		
		// ISO 8601
		// Data e hora com fuso horário (ZonedDateTime)
		ZonedDateTime naZona = ZonedDateTime.now(ZoneId.of("America/Fortaleza"));
		
		String isoComZona = naZona.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);		
		
        System.out.println(naZona);
        System.out.println(isoComZona);
        
		

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
2026-11-27T23:50:40.509220100-03:00[America/Fortaleza]
2026-11-27T23:50:40.5092201-03:00[America/Fortaleza]
--------------------------
tempo execução em ns: 32474891







 
 
*/
