package programa;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Set<String> set = new TreeSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("pendrive");

		System.out.println(set.contains("Notebook"));

		for (String cada : set) {
			System.out.println(cada);
		}

		System.out.println();
	}

}
/*
true
Notebook
TV
Tablet
pendrive



 
------------------------------------
Set
hashset, treeset, linkedhashset
hashset: mais rapido, nao garante ordem



*/
