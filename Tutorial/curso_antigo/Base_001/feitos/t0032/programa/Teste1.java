package programa;

import entidades.Produtos;

public class Teste1 {

	public static void main(String[] args) {
		Produtos produto = new Produtos();
		
		produto.nome = "manteiga";
		produto.preco = 10.0;
		produto.quantidade = 3;

		System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade );
		System.out.println(produto.toString());
		System.out.println(produto);

	}

}
/*
manteiga, 10.0, 3
manteiga
manteiga



classe :
   atributos-> dados
   métodos->funções/operações




*/
