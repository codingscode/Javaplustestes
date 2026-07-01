package programa;

public class Tut001 {
	
	static int c_mdc(int n1, int n2) {
		int mdc = 1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
		   if (n1 % i == 0 && n2 % i == 0) {
			   mdc = i;
		   }
		}
		return mdc;
	}
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // maior divisor comum
		int a = 36;
		int b = 60;
		
		System.out.print("mdc: ");
		System.out.println(c_mdc(a, b));
		
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
mdc: 12
--------------------------
tempo execução em ms: 0


 
 
*/
