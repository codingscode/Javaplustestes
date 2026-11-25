
package programa;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Tut001 {


	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// formatador ano/mes/dia hora:minuto:segundo:milisegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        
        LocalDateTime momento1 = LocalDateTime.parse("2023/10/16 12:23:05.200", formatador);

		System.out.println(momento1);
                
		// +2 dias
        System.out.println(momento1.plusDays(2));
        
        // +3 meses
        System.out.println(momento1.plusMonths(3));
		
        // +5 anos
        System.out.println(momento1.plusYears(5));
		
        // +2 semanas
        System.out.println(momento1.plusWeeks(2));
		
        
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
2023-10-16T12:23:05.200
2023-10-18T12:23:05.200
2024-01-16T12:23:05.200
2028-10-16T12:23:05.200
2023-10-30T12:23:05.200
--------------------------
tempo execução em ns: 17259267



















 
 
*/
