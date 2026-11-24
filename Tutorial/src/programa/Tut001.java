
package programa;

import java.time.LocalDateTime;


public class Tut001 {


	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//
        
        LocalDateTime agora = LocalDateTime.now();

		System.out.println(agora);
		
		// milisegundos, nanosegundos
		System.out.println(agora.getNano()/1000000);
		System.out.println(agora.getNano());
		
        
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
