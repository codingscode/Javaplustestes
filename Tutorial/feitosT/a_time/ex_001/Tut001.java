
package programa;

import java.time.LocalDateTime;


public class Tut001 {


	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//
        
        LocalDateTime agora = LocalDateTime.now();

		System.out.println(agora);
		
		// hora, minuto, segundo
		System.out.println(agora.getHour());
		System.out.println(agora.getMinute());
		System.out.println(agora.getSecond());
		
		// ano, mes, dia
		System.out.println(agora.getYear());
		System.out.println(agora.getMonthValue());
		System.out.println(agora.getDayOfMonth());
		
		
		
		
        
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
