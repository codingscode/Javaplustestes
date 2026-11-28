
package programa;

import java.time.Instant;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador dia/mes/ano hora:minuto:segundo:nanosegundos
        //DateTimeFormatter formatadorGmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);
        //DateTimeFormatter formatadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        
		//DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		
		// ISO 8601
		// Timestamp em UTC (Instant)
		Instant agoraUtc = Instant.now();
		String textoIso = agoraUtc.toString();

		Instant parseado = Instant.parse("2026-11-27T23:31:00Z");
		
		
        System.out.println(agoraUtc);
        System.out.println(textoIso);
        System.out.println(parseado);
		

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
2026-11-28T02:38:09.571492568Z
2026-11-28T02:38:09.571492568Z
2026-11-27T23:31:00Z
--------------------------
tempo execução em ns: 18702357






 
 
*/
