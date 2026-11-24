
package programa;

import java.time.LocalDateTime;


public class Tut001 {


	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		//
        
        LocalDateTime agora = LocalDateTime.now();

		System.out.println(agora);
		
		// milisegundos desde 1/1/1970
		System.out.println(System.currentTimeMillis());
		
		// anos desde 1/1/1970
		System.out.println(System.currentTimeMillis()/(1000*60*60*24*365.25));
		
		
		
		
		
        
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
2026-11-24T12:26:18.257584574
1795533978258
56.89703837611225
--------------------------
tempo execução em ns: 30043945





 
 
*/
