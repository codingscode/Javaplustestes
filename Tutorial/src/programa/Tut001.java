
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

        LocalDateTime momento2 = LocalDateTime.parse("2023/10/17 17:42:37.543", formatador);
        
        Duration diferenca = Duration.between(momento1, momento2);
		

		System.out.println(momento1);
		System.out.println(momento2);
                
		System.out.println(diferenca);
		
		// segundos totais
        System.out.println(diferenca.getSeconds()/(60*60));
        
        // minutos totais
        
        
        // horas totais
		
        
        
        
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
2023/10/16 12:23:05.200
2023/10/17 17:42:37.543
PT29H19M32.343S
29
19
32
343
--------------------------
tempo execução em ns: 52466559






 
 
*/
