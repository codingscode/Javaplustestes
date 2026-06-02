package programa;

public class Tut001 {
	
	public static void saudacao() {
		System.out.println("olá");
	}
	
	public static int valor(int v) {
		return v;
	}
	
	public static void main(String[] args) {
		
		// classe
		
		long startTime = System.nanoTime();
		int x = 4;

		Tut001 objeto = new Tut001();
		
		objeto.saudacao();
		System.out.println(valor(x));
		
		
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
olá
4
--------------------------
tempo execução em ms:
0


*/
