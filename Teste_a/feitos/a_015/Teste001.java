package Programa;

import java.util.Arrays;
import java.util.HashSet;

public class Teste001 {
	

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		HashSet<Character> s1 = new HashSet<>(Arrays.asList('b','o', 'r', 'b', 'o', 'l', 'e', 't', 'a'));
		HashSet<Character> s2 = new HashSet<>(Arrays.asList('f', 'o', 'c', 'a'));
		
		System.out.println(s1);
		System.out.println(s2);
		
		HashSet<Character> intersecao = new HashSet<>(s1);
		intersecao.retainAll(s2);
		
		HashSet<Character> uniao = new HashSet<>(s1);
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
[a, b, r, t, e, l, o]
[a, c, f, o]
interseção:
[a, o]
união:
[a, b, r, c, t, e, f, l, o]
--------------------------
--------------------------
tempo execução em ms:
0







*/
;