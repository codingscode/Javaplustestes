package programa;

import java.util.Locale;

import entidades.Produtos;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome = "tecido";
		double preco = 40.0;
		int quantidade = 3;
		
		Produtos produto = new Produtos(nome, preco, quantidade);

		System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade );
		System.out.println(produto.toString());
		System.out.println(produto);
		System.out.println();

		produto.adicionarProdutos(quantidade);
		System.out.println(produto.toString());
		System.out.println();

		quantidade = 4;
		produto.removerProdutos(quantidade);
		System.out.println(produto.toString());

	}
	

}
/*
tecido, 40.0, 3
tecido, R$40.00, 3 unidades, total: R$ 120.00
tecido, R$40.00, 3 unidades, total: R$ 120.00

tecido, R$40.00, 6 unidades, total: R$ 240.00

tecido, R$40.00, 2 unidades, total: R$ 80.00


Construtor


*/
