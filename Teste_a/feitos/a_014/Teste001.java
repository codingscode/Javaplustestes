package Programa;

import java.util.Arrays;
import java.util.HashSet;

public class Teste001 {
	

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(3,4,7,9,12,20));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(2,5,7,9,16));
		
		System.out.println(s1);
		System.out.println(s2);
		
		HashSet<Integer> intersecao = new HashSet<>(s1);
		intersecao.retainAll(s2);
		
		HashSet<Integer> uniao = new HashSet<>(s1);
		uniao.addAll(s2);
		
		System.out.println("interseção:");
		System.out.println(intersecao);
		System.out.println("união:");
		System.out.println(uniao);
		
		
		
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
criar código de interseção e união de conjuntos 
[3, 4, 20, 7, 9, 12]
[16, 2, 5, 7, 9]
interseção:
[7, 9]
união:
[16, 2, 3, 4, 20, 5, 7, 9, 12]
--------------------------
--------------------------
tempo execução em ms:
0





*/
;