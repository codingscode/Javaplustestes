package programa;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));

		list.sort(new MeuComparador());

		for (Produto cada : list) {
			System.out.println(cada);
		}

		//ordena por nome
		System.out.println();
	}

}
/*
Produto [nome=Notebook, preco=1200.0]
Produto [nome=Tablet, preco=450.0]
Produto [nome=TV, preco=900.0]


------------------------------------
comparator


*/
