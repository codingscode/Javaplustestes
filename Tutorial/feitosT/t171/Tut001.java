package programa;

public class Tut001 {
	
	static boolean e_primo(int n) {
		int cont = 0;
		
		for (int i = n/2; i >= 1; i--) {
			if (n % i == 0) {
				cont += 1;
			}
		}
		
		if (cont == 1) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // checar número primo
		
		int numero = 7;
		
		System.out.print("primo ? : ");
		System.out.println(e_primo(numero));
		
		System.out.println(e_primo(5));
		System.out.println(e_primo(6));
		
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
primo ? : true
true
false
--------------------------
tempo execução em ms: 0


 
 
*/
