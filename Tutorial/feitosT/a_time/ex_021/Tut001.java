
package programa;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador ano/mes/dia hora:minuto:segundo:nanosegundos
        DateTimeFormatter formatadorGmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);

        DateTimeFormatter formatadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        
		
		// gmt
		Instant agoraGmt = Instant.now();
		
        System.out.println(agoraGmt);
        
		System.out.println("gmt:");
        System.out.println(formatadorGmt.format(agoraGmt));
        
		System.out.println("local:");
        System.out.println(formatadorLocal.format(agoraGmt));
		
        
        

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
2026-11-27T13:03:51.548104565Z
gmt:
27/11/2026 13:03:51.548
local:
27/11/2026 10:03:51.548
--------------------------
tempo execução em ns: 36548734






 
 
*/
