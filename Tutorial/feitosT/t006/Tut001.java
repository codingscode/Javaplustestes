package programa;

public class Tut001 {
	public static void main(String[] args) {
		
        long startTime = System.nanoTime();
		
        int num1 = 6, num2 = 4, num3 = -15;
        float num4 = 4.6f, num5 = 3.2f;
        
        
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.abs(num3));
        System.out.println(Math.pow(num1, 2.3));
                
        System.out.println("--------------------------");
        System.out.println(Math.round(num4));
        System.out.println(Math.ceil(num4));
        System.out.println(Math.floor(num4));
        System.out.println(Math.round(num5));
        
        System.out.println("--------------------------");
        
        double ale1 = Math.random();
        int ale2 = (int) (Math.random() * 101); // de 0 a 100
        
        System.out.println(ale1);
        System.out.println(ale2);
		
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
6
4
2.449489742783178
15
61.623714938749366
--------------------------
5
5.0
4.0
3
--------------------------
0.5527300641780191
55
--------------------------
tempo execução em ms:
1

 
*/

