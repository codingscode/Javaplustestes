package programa;


//Same functional interface
interface Saldacao {
	void digaOla();
}

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		
		Saldacao g = () -> System.out.println("Olá de lambda");
		
		g.digaOla();
		
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
Olá de lambda
--------------------------
tempo execução em ms: 8





 
 
*/
