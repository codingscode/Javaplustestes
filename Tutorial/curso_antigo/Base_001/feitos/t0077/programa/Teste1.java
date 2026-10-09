package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Forma> lista = new ArrayList<>();

		char resp1 = 'r';
		Cor cor1 = Cor.valueOf("PRETO");
		if (resp1 == 'r') {
			double largura = 4.0;
			double altura = 5;
			lista.add(new Retangulo(cor1, largura, altura));
		}
		else {
			double raio = 3.0;
			lista.add(new Circulo(cor1, raio));
		}
		//
		char resp2 = 'c';
		Cor cor2 = Cor.valueOf("VERMELHO");
		if (resp2 == 'r') {
			double largura2 = 10.0;
			double altura2 = 3;
			lista.add(new Retangulo(cor2, largura2, altura2));
		}
		else {
			double raio2 = 3.0;
			lista.add(new Circulo(cor2, raio2));
		}
		
		System.out.println();
		System.out.println("áreas formas:");
		
		for (Forma cada : lista){
			System.out.println(String.format("%.2f",  cada.area()));
		}
		System.out.println();

	}

}
/*

áreas formas:
20.00
28.27




------------------------------------
métodos abstratos
- sao metodos que nao possuem implementação
- metodos precisam ser abstratos quando a classe é generica demais para conter sua implementação
- se uma classe possuir pelo menos um metodo abstrato, entao esta classe tambem é abstrata


*/
