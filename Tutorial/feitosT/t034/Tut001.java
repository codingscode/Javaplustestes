package programa;

public class Tut001 {
	
	static void metodostatic() {
		System.out.println("chamado sem criar objetos");
	}
	
	
	public static void main(String[] args) {
		
		// construtores
		long startTime = System.nanoTime();

		metodostatic();
		Tut001.metodostatic();
		
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
chamado sem criar objetos
chamado sem criar objetos
--------------------------
tempo execução em ms:
0


*/
