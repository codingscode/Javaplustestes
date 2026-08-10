package programa;


public class Tut001 extends Thread {
	public static int quantidade = 0;
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Threads
		Tut001 thread = new Tut001();
		
		thread.start();

		System.out.println(quantidade);
		quantidade++;
		
		System.out.println(quantidade);

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
	
	}
	
    public void run() {
    	quantidade++;
	}
	

}

/*
0
2
--------------------------
tempo execução em ms:
0






*/
