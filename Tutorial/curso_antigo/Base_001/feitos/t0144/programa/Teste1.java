package programa;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Set<String> set = new LinkedHashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("pendrive");
		set.add("Pc");

		System.out.println(set.contains("Notebook"));

		System.out.println(set);
		set.remove("Tablet");
		System.out.println(set);

		set.removeIf(x -> x.length() >= 3);
		System.out.println(set);

		System.out.println();
	}

}
/*
true
[TV, Tablet, Notebook, pendrive, Pc]
[TV, Notebook, pendrive, Pc]
[TV, Pc]

 
------------------------------------
Set
hashset, treeset, linkedhashset
hashset: mais rapido, nao garante ordem



*/
