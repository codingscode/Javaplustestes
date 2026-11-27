
package programa;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Tut001 {


	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// formatador ano/mes/dia hora:minuto:segundo:nanosegundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        
        LocalDateTime momento1 = LocalDateTime.parse("2023/10/16 12:23:05.200", formatador);

        LocalDateTime momento2 = LocalDateTime.parse("2023/10/17 17:42:37.543", formatador);
        
        Period diferenca = Period.between(momento1.toLocalDate(), momento2.toLocalDate());
		

		System.out.println(momento1);
		System.out.println(momento2);
                
        System.out.println(diferenca);
        
        System.out.println(diferenca.getDays());
        System.out.println(diferenca.getMonths());
		
        /*
        Period diferença entre datas, ignorando os horários.
        Já Duration calcula uma quantidade de tempo entre dois valores 
         temporais. 
        */
        
        
        
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
2023-10-17T17:42:37.543
P1D
1
0
--------------------------
tempo execução em ns: 16596520






 
 
*/
