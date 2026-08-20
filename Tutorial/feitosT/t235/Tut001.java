package programa;

import java.util.ArrayList;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		ArrayList<Integer> numeros = new ArrayList<>(List.of(3,4,5,6,7));
		
		ArrayList<String> nomes = new ArrayList<>(List.of("mel", "aladim", "lily"));
		
        System.out.println(numeros);
        
        numeros.remove(0); // remove pelo indice
                
        System.out.println(numeros);
		
        numeros.remove(Integer.valueOf(6)); // remove pelo objeto
        
        System.out.println(numeros);
        
        nomes.remove("lily");
        
        System.out.println(nomes);
		
		
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
[3, 4, 5, 6, 7]
[4, 5, 6, 7]
[4, 5, 7]
[mel, aladim]
--------------------------
tempo execução em ms: 0



*/
