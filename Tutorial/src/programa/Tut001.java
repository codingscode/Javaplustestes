
package programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {

    
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
        // 
		//
		// formatador ano/mes/dia hora:minuto:segundo:milisegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
		        
		LocalDateTime momento1 = LocalDateTime.parse("16/10/2023 12:23:05.200", formatador);
		LocalDateTime momento2 = LocalDateTime.parse("18/10/2023 08:42:31.580", formatador);
		        
		        
		System.out.println(momento1.format(formatador));
		System.out.println(momento2.format(formatador));
		System.out.println("*********************");
        
		// alterando hora e dia
		momento1 = momento1.withHour(9);
		momento1 = momento1.withDayOfMonth(14);
		
		// alterando mes e ano
		momento2 = momento2.withMonth(3);
		momento2 = momento2.withYear(2025);
		
		System.out.println(momento1.format(formatador));
		System.out.println(momento2.format(formatador));
		
        
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
16/10/2023 12:23:05.200
18/10/2023 08:42:31.580
*********************
14/10/2023 09:23:05.200
18/03/2025 08:42:31.580
--------------------------
tempo execução em ns: 16867794







 
 
*/
