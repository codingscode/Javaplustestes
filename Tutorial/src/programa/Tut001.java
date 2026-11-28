
package programa;

import java.time.LocalDateTime;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// formatador dia/mes/ano hora:minuto:segundo:nanosegundos
        //DateTimeFormatter formatadorGmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);
        //DateTimeFormatter formatadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
        
		//DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		
		// ISO 8601
		LocalDateTime local = LocalDateTime.now();
        LocalDateTime dataHora = LocalDateTime.parse("2026-11-27T23:31:00");
        
        System.out.println(local);
        System.out.println(dataHora);
        
		

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
2026-11-28T00:04:23.953857026
2026-11-27T23:31
--------------------------
tempo execução em ns: 37036033







 
 
*/
