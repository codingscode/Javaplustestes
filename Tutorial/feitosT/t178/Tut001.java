package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		// metodo copia de valor
		
		char[] s1 = {'b', 'o', 'r', 'b', 'o', 'l', 'e', 't', 'a'};
		String s2 = "";
		s2 = s2.copyValueOf(s1, 0, 5);
		
		System.out.print("string retornada: ");
		System.out.println(s2);
		
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
string retornada: borbo
--------------------------
tempo execução em ms: 0


 
 
*/
