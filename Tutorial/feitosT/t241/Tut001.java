package programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // ArrayList metodos
		// 
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> b = Arrays.asList(3, 4, 7, 8);

        Set<Integer> setA = new HashSet<>(a);
        Set<Integer> setB = new HashSet<>(b);

        setA.retainAll(setB);

        List<Integer> c = new ArrayList<>(setA);

        System.out.println(c);


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
[3, 4]
--------------------------
tempo execução em ms: 0



*/
