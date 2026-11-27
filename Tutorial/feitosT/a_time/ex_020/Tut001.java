
package programa;

import java.time.Instant;
import java.time.OffsetDateTime;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Converter string para UTC

		
		// formatador ano/mes/dia hora:minuto:segundo:nanosegundos
		// Formato ISO-8601 com 'Z' (UTC)
        Instant instant = Instant.parse("2026-11-26T22:42:00Z");

        // Formato ISO-8601 com offset explícito (ex: -03:00)
        OffsetDateTime odt = OffsetDateTime.parse("2026-11-26T22:42:00-03:00");
        Instant instantFromOffset = odt.toInstant();        
		
        
        System.out.println(odt);
        System.out.println(instantFromOffset);
        
        

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
2026-11-26T22:42-03:00
2026-11-27T01:42:00Z
--------------------------
tempo execução em ns: 18915417





 
 
*/
