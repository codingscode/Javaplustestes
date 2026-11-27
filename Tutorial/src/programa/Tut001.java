
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
        
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		
		ZonedDateTime local = ZonedDateTime.now(ZoneId.of("America/Fortaleza"));
        ZonedDateTime emGmt = local.withZoneSameInstant(ZoneId.of("GMT"));

        
        System.out.println("local:");
        System.out.println(formatador.format(local));
        
        System.out.println("em gmt:");
        System.out.println(formatador.format(emGmt));
				
		
        
        
        

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
local:
27/11/2026 10:16:34.081
em gmt:
27/11/2026 13:16:34.081
--------------------------
tempo execução em ns: 31110973






 
 
*/
