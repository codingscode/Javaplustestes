package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // encontrar duplicados
		int[] numeros = {1, 2, 3, 2, 4, 5, 1};
        
		for (int i = 0; i < numeros.length; i++) {
		   for (int j = i + 1; j < numeros.length; j++) {
		      if (numeros[i] == numeros[j]) {
		        System.out.print("duplicado: ");
		        System.out.println(numeros[i]);
		      }
		   }
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
duplicado: 1
duplicado: 2
--------------------------
tempo execução em ms: 0


 
 
*/
