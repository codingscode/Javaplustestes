
package programa;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// converter um valor local para o utc
		
		// formatador ano/mes/dia hora:minuto:segundo:nanosegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS").withZone(ZoneOffset.UTC);

		LocalDateTime local = LocalDateTime.parse("16/10/2023 12:23:05.200", formatador);
		ZoneId zonaLocal = ZoneId.of("America/Fortaleza"); // UTC-3
		
		ZonedDateTime zonedLocal = local.atZone(zonaLocal);
        Instant utc = zonedLocal.toInstant();
		
        
        System.out.println(zonedLocal);
        System.out.println(utc);
        
		
        

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
2023-10-16T12:23:05.200-03:00[America/Fortaleza]
2023-10-16T15:23:05.200Z
--------------------------
tempo execução em ns: 35569843










 
 
*/
