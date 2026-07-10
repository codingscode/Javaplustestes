package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		// métodos .isEmpty(), .join(), 
		
		String s1 = "macaco na arvore, macaco quer banana";
		
		System.out.println(s1.lastIndexOf("macaco")); // ultima ocorrencia
		System.out.println(s1.lastIndexOf("n", 10)); // " n em indice 10, separados padrao " "
		
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
18
7
--------------------------
tempo execução em ms: 0





 
 
*/
