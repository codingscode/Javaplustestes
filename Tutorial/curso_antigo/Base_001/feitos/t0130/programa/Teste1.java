package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Forma> minhasFormas = new ArrayList<>();
		minhasFormas.add(new Retangulo(3.0, 2.0));
		minhasFormas.add(new Circulo(2.0));

		/*
		List<Circulo> meusCirculos = new ArrayList<>();
		meusCirculos.add(new Circulo(2.0));
		meusCirculos.add(new Circulo(3.0));
		*/

		System.out.println("Area total: " + areaTotal(minhasFormas));

		System.out.println();
	}

	public static double areaTotal(List<Forma> list) {
		double soma = 0.0;
		for (Forma s : list) {
			soma += s.area();
		}
		return soma;
	}

}
/*
Area total: 18.5663

------------------------------------
curingas delimitados (bounded wildcards)




*/
