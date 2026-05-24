package Programa;

import java.util.HashSet;

public class Teste001 {
	

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		String s1 = "borboleta";
        String s2 = "foca";

        HashSet<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) set1.add(c);

        HashSet<Character> set2 = new HashSet<>();
        for (char c : s2.toCharArray()) set2.add(c);

        HashSet<Character> set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        
        HashSet<Character> set4 = new HashSet<>(set1);
        set4.addAll(set2);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println("interseção:");
		System.out.println(set3);
		System.out.println("união:");
		System.out.println(set4);
		
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
[a, b, r, t, e, l, o]
[a, c, f, o]
interseção:
[a, o]
união:
[a, b, r, c, t, e, f, l, o]
--------------------------
--------------------------
tempo execução em ms:
1



*/
;