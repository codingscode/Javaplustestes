package programa;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

		//uniao
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		//interseção
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		//diferença
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

		System.out.println();
	}

}
/*
[0, 2, 4, 5, 6, 7, 8, 9, 10]
[5, 6, 8, 10]
[0, 2, 4]



 
------------------------------------
Set
hashset, treeset, linkedhashset
hashset: mais rapido, nao garante ordem



*/
