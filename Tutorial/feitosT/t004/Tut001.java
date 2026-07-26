package programa;

public class Tut001 {
	public static void main(String[] args) {
		
        long startTime = System.nanoTime();
		
        String animal = "tubarao no mar";
        System.out.println(animal);
        System.out.println(animal.length());
        
        System.out.println(animal.indexOf("no")); // 8
        System.out.println(animal.charAt(3)); // a

        System.out.println("--------------------------");
        String s1 = "oi";
        String s2 = "oi";
        String s3 = "bom dia";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
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
tubarao no mar
14
8
a
--------------------------
true
false
--------------------------
--------------------------
tempo execução em ms:
0

 
*/

