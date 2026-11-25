
package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Tut001 {


	
	public static void main(String[] args) throws ParseException {
		long startTime = System.nanoTime();

		// formatador ano/mes/dia hora:minuto:segundo:milisegundos
		//DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        
        //LocalDateTime momento1 = LocalDateTime.parse("2023/10/16 12:23:05.200", formatador);
        //LocalDateTime momento2 = LocalDateTime.parse("2023/10/18 08:42:31.580", formatador);
        
        // nao é bom
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        Date momento = formatador.parse("16/10/2023 12:23:05.200");
        
        
		System.out.println(momento);
		        
        
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
Mon Oct 16 12:23:05 BRT 2023
--------------------------
tempo execução em ns: 80210103








 
 
*/
