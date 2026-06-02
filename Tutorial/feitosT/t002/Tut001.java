package programa;

public class Tut001 {
	public static void main(String[] args) {
		
        long startTime = System.nanoTime();
		
        // casting
        int meuint = 9;
        double meud = meuint;
        
        System.out.println(meuint);
        System.out.println(meud);
        System.out.println("--------------------------");
        
        float num1 = 1.23f;
        int num2 = (int) num1;
        String s1 = String.valueOf(num1);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(s1);
        
        
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
9
9.0
--------------------------
1.23
1
1.23
--------------------------
tempo execução em ms:
0

 
*/

