
package programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {

    
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
        

		LocalDateTime agora = LocalDateTime.now();

		System.out.println(agora);
		
		// formatador ano/mes/dia hora:minuto:segundo:milisegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

		System.out.println(agora.format(formatador));
		
        
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










 
 
*/
