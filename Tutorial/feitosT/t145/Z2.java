package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        String algo = "macaco";
        char[] caracs = algo.toCharArray(); // converte para array de char
        
        System.out.println(algo);
        
        caracs[1] = 'i';
        
        String algo2 = String.valueOf(caracs); // converte array de char para String
        
        System.out.println(algo2);
                
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
macaco
micaco
--------------------------
tempo execução em ms: 0













*/



