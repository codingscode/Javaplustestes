package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // soma dos digitos de um número
		int numero = 5813;
		int soma = 0;
		
		while (numero > 0) {
			soma += numero % 10;
			numero /= 10;
		}
		
		
		System.out.println(soma);

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
17
--------------------------
tempo execução em ms: 0







 
 
*/
