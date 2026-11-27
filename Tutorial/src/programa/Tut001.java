
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
		
		ZoneOffset offsetMenos3 = ZoneOffset.of("-03:00");
				
		OffsetDateTime agoraMenos3 = OffsetDateTime.now(offsetMenos3);
		
		OffsetDateTime agoraUtc = OffsetDateTime.now(ZoneOffset.UTC);
		
		
		System.out.println(offsetMenos3);
		
		System.out.println(formatador.format(agoraMenos3));
		
		System.out.println(formatador.format(agoraUtc));
        
        
        

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
-03:00
27/11/2026 10:28:20.983
27/11/2026 13:28:20.983
--------------------------
tempo execução em ns: 13832143








 
 
*/
