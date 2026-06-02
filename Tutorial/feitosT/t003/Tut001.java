package programa;

public class Tut001 {
	public static void main(String[] args) {
		
        long startTime = System.nanoTime();
		
        int x = 4;
        System.out.println(x);
        
        x &= 3; // binario
        System.out.println(x);
        
        System.out.println("--------------------------");
        int y = 3, z = 5;
        boolean k, m, l;
        
        k = y > z;
        m = y != z;
        l = z == 7;
        
        System.out.println(k);
        System.out.println(m);
        System.out.println(l);
        System.out.println("--------------------------");
		
        int v1 = 5, v2 = 17;
        boolean v3 = true;
        
        System.out.println(v1 < 8 && v2 > 12);
        System.out.println(v1 == 8 || v2 > 12);
        System.out.println(!v3);
		
		
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
4
0
--------------------------
false
true
false
--------------------------
true
true
false
--------------------------
tempo execução em ms:
0





 
*/

