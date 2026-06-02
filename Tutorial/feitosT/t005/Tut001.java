package programa;

public class Tut001 {
	public static void main(String[] args) {
		
        long startTime = System.nanoTime();
		
        String s1 = "oi", s2 = " bom dia", s3 = "cavalo", s4 = " marrom";
        
        System.out.println(s1);
        System.out.println(s1.concat(s2)); // s1 += s2;
        String r = s3.concat(s4);
        System.out.println(r);

        
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
oi
oi bom dia
cavalo marrom
--------------------------
--------------------------
--------------------------
tempo execução em ms:
0

 
*/

