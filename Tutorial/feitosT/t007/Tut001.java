package programa;

public class Tut001 {
	public static void main(String[] args) {
		
        long startTime = System.nanoTime();
		
        int num1 = 2;
        int num2 = 3;
        
        if (num1 > 1) {
        	System.out.println("legal");
        }
        else {
        	System.out.println("bad");
        }
        
        String resultado = (num2 != num1) ? "diferentes" : "iguais";
        System.out.println(resultado);
        
        System.out.println("--------------------------");

        
        System.out.println("--------------------------");
        

		
		System.out.println("--------------------------");
		
		
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		//milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
		
		
	}
	
	
}

/*
legal
diferentes
--------------------------
--------------------------
--------------------------
tempo execução em ms:
0

 
*/

