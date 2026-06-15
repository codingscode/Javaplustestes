package programa;

public class Tut001 extends Thread {
	public static int quantidade = 0;
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Threads
		Tut001 thread = new Tut001();
	    thread.start();
	    // Wait for the thread to finish
	    while(thread.isAlive()) {
	       System.out.println("esperando...");
	    }
	    // Update amount and print its value
	    System.out.print("Tut001: ");
	    System.out.println(quantidade);
	    quantidade++;
	    
	    System.out.print("Tut001: ");
	    System.out.println(quantidade);
	    
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}
	
    public void run() {
    	quantidade++;
	}
	

}

/*
esperando...
Tut001: 1
Tut001: 2
--------------------------
tempo execução em ms: 0




*/
