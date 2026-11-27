
package programa;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador ano/mes/dia hora:minuto:segundo:nanosegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);

		// utc
		Instant agoraUtc = Instant.now();
		
        System.out.println(agoraUtc);
        System.out.println(formatador.format(agoraUtc));
        
		
		LocalDateTime momento1 = LocalDateTime.parse("16/10/2023 12:23:05.200", formatador);

		System.out.println(momento1);



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
2026-11-27T01:59:35.568334279Z
27/11/2026 01:59:35.568
2023-10-16T12:23:05.200
--------------------------
tempo execução em ns: 17778638










 
 
*/
