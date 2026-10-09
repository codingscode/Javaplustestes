package util;

import java.util.List;

import entidades.Produto;

public class ProdutoServico {
	public double somafiltrada(List<Produto> lista){
		double soma = 0.0;
		for (Produto p : lista) {
			if (p.getNome().charAt(0) == 'T'){
				soma += p.getPreco();
			}
		}
		return soma;
	}
}

