package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // segundo maior
		int[] numeros = {12, 5, 9, 21, 21, 7};
		Integer primeiro = null, segundo = null;
		
		
		for (int cada : numeros) {
			if (primeiro == null || primeiro < cada) {
				segundo = primeiro;
				primeiro = cada;
			}
			else if ((segundo == null || segundo < cada) && cada != primeiro) {
				segundo = cada;
			}
		}
		
		System.out.print("primeiro: ");
		System.out.println(primeiro);
		System.out.print("segundo: ");
		System.out.println(segundo);
		
		
		
		
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
primeiro: 21
segundo: 12
--------------------------
tempo execução em ms: 0

 
 
*/
