
package programa;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Tut001 {


	
	public static void main(String[] args) throws ParseException {
		long startTime = System.nanoTime();

		// formatador ano/mes/dia hora:minuto:segundo:milisegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
        
        LocalDateTime momento1 = LocalDateTime.parse("16/10/2023 12:23:05.200", formatador);
        LocalDateTime momento2 = LocalDateTime.parse("18/10/2023 08:42:31.580", formatador);
        
        
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
--------------------------
tempo execução em ns: 17122540








 
 
*/
