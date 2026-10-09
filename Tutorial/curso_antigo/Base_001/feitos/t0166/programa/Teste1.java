package programa;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produto> lista = new ArrayList<>(); // vazia

		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD Case", 80.90));
		imprimir(lista);
		System.out.println();
				
		lista.forEach(Produto::staticPrecoAtualizar);
		lista.forEach(System.out::println);

		System.out.println();
	}

	public static void imprimir(List<Produto> l) {
		for (Produto cada : l) {
			System.out.println(cada);
		}
	}

	/*
	public static <T> void imprimir(List<T> l) {
		for (T cada : l) {
			System.out.println(cada);
		}
	}
	*/

}


/*
TV, 900.0
Mouse, 50.0
Tablet, 350.5
HD Case, 80.9

TV, 990.00
Mouse, 55.00
Tablet, 385.55
HD Case, 88.99

------------------------------------
programação funcional e calculo lambda

interface funcional -> tem um unico metodo abstrato

predicate -> 

consumer -> interface




*/
