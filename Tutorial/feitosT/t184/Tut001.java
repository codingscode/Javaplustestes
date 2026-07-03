package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		// primeira ocorrencia
		
		String s1 = "bacana planeta terra.";
		System.out.println(s1.indexOf("planeta"));
		System.out.println(s1.indexOf("n", 5)); // encontrar n iniciando no indice 5
		
		
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
7
10
--------------------------
tempo execução em ms: 0





 
 
*/
