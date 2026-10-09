package programa;

import java.util.Locale;

import entidades.Produtos;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
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
manteiga, R$10.00, 3 unidades, total: R$ 30.00
manteiga, R$10.00, 3 unidades, total: R$ 30.00


classe :
   atributos-> dados
   métodos->funções/operações




*/
