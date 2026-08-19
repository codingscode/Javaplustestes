package programa;

import java.util.ArrayList;
import java.util.Arrays;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        
        ArrayList<String> carros = new ArrayList<>();
		
		carros.add("celta");
		carros.add("komb");
		carros.add("pampa");
		carros.add("l200");
	    	    
	    System.out.println(carros);
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}
	
	
	

}

/*

1
2
5
--------------------------
tempo execução em ms: 0





*/
