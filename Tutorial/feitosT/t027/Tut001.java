package programa;

public class Tut001 {
	
	int x; // criando atributo
	
	public Tut001() {
		x = 5; // colocando valor inicial
	}
	
	
	public static void main(String[] args) {
		
		// construtores
		long startTime = System.nanoTime();

		Tut001 objeto = new Tut001();
		
		System.out.println(objeto.x);
		
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*
5
--------------------------
tempo execução em ms:
0


*/
