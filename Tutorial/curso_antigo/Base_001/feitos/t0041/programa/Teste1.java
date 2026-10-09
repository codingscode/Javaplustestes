package programa;

import java.util.Locale;

import entidades.Produtos;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome = "tecido";
		double preco = 40.0;

		Produtos produto = new Produtos(nome, preco);

		//System.out.println(produto.nome);
		System.out.println(produto.getNome() + ", " + produto.getPreco() + ", " + produto.getQuantidade() );
		System.out.println(produto.toString());
		System.out.println(produto);
		
		produto.setNome("TV");
		System.out.println();

		int quantidade = 5;
		produto.adicionarProdutos(quantidade);
		System.out.println(produto.toString());
		System.out.println();

		quantidade = 4;
		produto.removerProdutos(quantidade);
		System.out.println(produto.toString());

	}


}
/*
modificadores de acesso
 
---------------------------




*/
