package programa;

import java.util.ArrayList;

public class Tut001 {
	
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add(0, "Mazda");
		
		System.out.println(carros);
		
		carros.remove(2);
		
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










*/
