package programa;

import java.util.HashSet;
import java.util.Set;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // contar vogais
		String texto = "ola Java";
		
	    Set<Character> vogais = new HashSet<>();
	    
	    for (char v : new char[]{'a','e','i','o','u'}) {
	    	vogais.add(v);
	    }

	    int contador = 0;
	    
	    for (char c : texto.toLowerCase().toCharArray()) {
	      if (vogais.contains(c)) {
	    	  contador++;
	      }
	    }

	    System.out.print("vogais: ");
		System.out.println(contador);
		
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
vogais: 4
--------------------------
tempo execução em ms: 0





 
 
*/
