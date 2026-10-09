package programa;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD Case", 80.90));
		imprimir(lista);
		System.out.println();

		lista.removeIf(p -> p.getPreco() >= 100);
		imprimir(lista);

		System.out.println();
	}

	public static void imprimir(List<Produto> l) {
		for (Produto cada : l) {
			System.out.println(cada);
		}
	}

}


/*
Produto [nome=TV, preco=900.0]
Produto [nome=Mouse, preco=50.0]
Produto [nome=Tablet, preco=350.5]
Produto [nome=HD Case, preco=80.9]

Produto [nome=Mouse, preco=50.0]
Produto [nome=HD Case, preco=80.9]

------------------------------------
programação funcional e calculo lambda

interface funcional -> tem um unico metodo abstrato

predicate -> 



*/
