package programa;

import java.util.ArrayList;
import java.util.Collections;



public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		
		ArrayList<Carro> meusCarros = new ArrayList<Carro>();
		
		// cria uma lista carros
		meusCarros.add(new Carro("BMW", "X5", 1999));
		meusCarros.add(new Carro("Honda", "Accord", 2006));
		meusCarros.add(new Carro("Ford", "Mustang", 1970));
		
		
		// lambda como comparator
		Collections.sort(meusCarros, (obj1, obj2) -> {
			Carro a = (Carro) obj1;
			Carro b = (Carro) obj2;
			if (a.ano < b.ano) return -1;
			if (a.ano > b.ano) return 1;
			return 0;
		});

	    // Display the cars
	    for (Carro c : meusCarros) {
	      System.out.print(c.marca);
	      System.out.print(" ");
	      System.out.print(c.modelo);
	      System.out.print(" ");
	      System.out.println(c.ano);
	    }

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
Ford Mustang 1970
BMW X5 1999
Honda Accord 2006
--------------------------
tempo execução em ms: 9





 
 
*/
