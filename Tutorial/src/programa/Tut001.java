
package programa;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador dia/mes/ano hora:minuto:segundo:nanosegundos
        //DateTimeFormatter formatadorGmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);
        //DateTimeFormatter formatadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		
		// Converter de um fuso horário (ZoneId) para OffsetDateTime
		
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
		
		OffsetDateTime odt = zdt.toOffsetDateTime();
		
		
		System.out.println(zdt);
		System.out.println(formatador.format(zdt));
		
		System.out.println(odt);
		System.out.println(formatador.format(odt));

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
2026-11-27T10:35:48.546153665-03:00[America/Sao_Paulo]
27/11/2026 10:35:48.546
2026-11-27T10:35:48.546153665-03:00
27/11/2026 10:35:48.546
--------------------------
tempo execução em ns: 32730252










 
 
*/
