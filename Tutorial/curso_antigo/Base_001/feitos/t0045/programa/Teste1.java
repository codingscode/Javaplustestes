package programa;

import java.util.Locale;

import entidades.Produto;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome1, nome2, nome3;
		double preco1, preco2, preco3;
		
		Produto[] vetor = new Produto[3];
		
		nome1 = "tv";
		preco1 = 1000.0;
		vetor[0] = new Produto(nome1, preco1);
		
		nome2 = "microonda";
		preco2 = 600.0;
		vetor[1] = new Produto(nome2, preco2);
		
		nome3 = "mesa";
		preco3 = 500.0;
		vetor[2] = new Produto(nome3, preco3);
		
		double soma = 0;
		for (int i=0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma/vetor.length;
		
		System.out.println("soma: " + soma);
		System.out.println("média: " + media);
		
		/*
		double[] vetor = new double[3]
		*/
		
	}


}
/*
soma: 2100.0
média: 700.0


*/
