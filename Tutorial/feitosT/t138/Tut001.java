package programa;


//Functional interface (one abstract method)
interface Saldacao {
	void digaOla(); // sem corpo
}

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		Saldacao g = new Saldacao() {
			public void digaOla() {
				System.out.println("Olá de uma classe anonima");
			}
		};
		
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
Olá de uma classe anonima
--------------------------
tempo execução em ms: 0








 
 
*/
