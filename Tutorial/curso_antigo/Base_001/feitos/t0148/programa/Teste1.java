package programa;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import entidades.Produto;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Set<Produto> set = new TreeSet<>();
		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));
		
		for (Produto cada : set) {
			System.out.println(cada);
		}

		System.out.println();
	}

}
/*
dá erro

na classe Produto nao foi implementado o comparable
Exception in thread "main" java.lang.ClassCastException: class entidades.Produto cannot be cast to class java.lang.Comparable (entidades.Produto is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.TreeMap.compare(TreeMap.java:1604)
	at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:811)
	at java.base/java.util.TreeMap.put(TreeMap.java:820)
	at java.base/java.util.TreeMap.put(TreeMap.java:569)
	at java.base/java.util.TreeSet.add(TreeSet.java:259)
	at programa.Teste1.main(Teste1.java:15)

------------------------------------
Set
hashset, treeset, linkedhashset
hashset: mais rapido, nao garante ordem



*/
