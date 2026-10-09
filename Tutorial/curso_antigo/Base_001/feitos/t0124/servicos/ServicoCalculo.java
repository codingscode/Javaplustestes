package servicos;

import java.util.List;

public class ServicoCalculo {
	public static Integer max(List<Integer> lista) {
		if (lista.isEmpty()) {
			throw new IllegalStateException("lista não pode estar vazia");
		}
		Integer max = lista.get(0);
		for (Integer item : lista) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
