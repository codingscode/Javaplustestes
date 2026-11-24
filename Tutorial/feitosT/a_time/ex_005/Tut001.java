
package programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Tut001 {


	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//
        
        LocalDateTime momento = LocalDateTime.of(2023,10,16,12,23,05,200);

		System.out.println(momento);
		
		// formatador ano/mes/dia hora:minuto:segundo:milisegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss.SSS");

		System.out.println(momento.format(formatador));
			
        
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
2023-10-16T12:23:05.000000200
2023/10/16 12:23:05.000
--------------------------
tempo execução em ns: 45325538




 
 
*/
