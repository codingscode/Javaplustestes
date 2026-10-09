package servico;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressora {
	private List<Integer> lista = new ArrayList<>();

	public void adicValor(Integer valor) {
		lista.add(valor);
	}

	public Integer primeiro() {
		if (lista.isEmpty()) {
			throw new IllegalStateException("lista está vazia");
		}
		return lista.get(0);
	}

	public void imprimir() {
		System.out.print("[");
		if (!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for (int i = 1; i < lista.size(); i++) {
			System.out.print(", " + lista.get(i));
		}
		System.out.println("]");
	}
}
