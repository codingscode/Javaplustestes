package programa;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import entidades.Produto;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Set<Produto> set = new HashSet<>();
		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));

		Produto prod = new Produto("Notebook", 1200.0);
		System.out.println(set.contains(prod));

		System.out.println();
	}

}
/*
true



hashcode e equals estao implementados

------------------------------------
Set
hashset, treeset, linkedhashset
hashset: mais rapido, nao garante ordem



*/
