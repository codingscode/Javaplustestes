package servicos;

import java.util.List;

public class ServicoCalculo {
	public static <T extends Comparable<? super T>> T max(List<T> lista) {
		if (lista.isEmpty()) {
			throw new IllegalStateException("lista não pode estar vazia");
		}

		T max = lista.get(0); // max variavel ou max nome do método

		for (T item : lista) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
