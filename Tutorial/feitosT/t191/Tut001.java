package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos para string
		//  
		
		String s1 = "questao completa! ganhei 30 ouros e 500 de experienciea.";
		
		String regex = "[0-9]+"; // expressao regular
		
		System.out.println(s1.replaceAll(regex, "($0)"));
		
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
questao completa! ganhei (30) ouros e (500) de experienciea.
--------------------------
tempo execução em ms: 5





 
 
*/
