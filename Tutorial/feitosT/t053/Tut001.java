package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// classe anonima de uma interface

		Saldacao objeto = new Saldacao() {
			public void digaOla() {
				System.out.println("bacana");
			}
		};
		
		objeto.digaOla();

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
		
		
	}

}

/*
bacana
--------------------------
tempo execução em ms:
0


*/
