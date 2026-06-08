package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// classe anonima

		Animal objeto = new Animal() {
			public void fazSom() {
				System.out.println("uuf uuf");
			}
		};
		
		objeto.fazSom();

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
uuf uuf
--------------------------
tempo execução em ms:
0







*/
