package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		
        // numero reverso
		int numero = 9483;
		int reverso = 0;
		
		System.out.print("numero: ");
		System.out.println(numero);
		
		while (numero != 0) {
			int digito = numero % 10;
			reverso = 10*reverso + digito;
			numero /= 10;
		}
		
		System.out.print("reverso: ");
		System.out.println(reverso);
		

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
numero: 9483
reverso: 3849
--------------------------
tempo execução em ms: 0







 
 
*/
