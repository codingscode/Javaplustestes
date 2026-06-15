package programa;

public class Tut001 implements Runnable {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Threads
		Tut001 objeto = new Tut001();
		Thread thread = new Thread(objeto);
	    thread.start();
	    System.out.println("este código está fora da thread");
	    

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
		System.out.println("--------------------------");
	}
	
	public void run() {
	    System.out.println("este código está rodando em uma thread");
	}
	

}

/*
este código está fora da thread
--------------------------
tempo execução em ms:
este código está rodando em uma thread
0
--------------------------




*/
