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
Produto [nome=Notebook, preco=1200.0]
Produto [nome=Tablet, preco=400.0]
Produto [nome=TV, preco=900.0]



na classe Produto foi implementado o comparable


------------------------------------
Set
hashset, treeset, linkedhashset
hashset: mais rapido, nao garante ordem



*/
