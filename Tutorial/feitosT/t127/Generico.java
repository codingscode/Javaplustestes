package programa;

public class Generico<T extends Number> { // subclasse de Number

	T[] numeros;

	// Constructor
	Generico(T[] numeros) {
		this.numeros = numeros;
	}

	// calcula media
	double media() {
		double soma = 0;
		for (T cada : numeros) {
			soma += cada.doubleValue();
		}
		return soma / numeros.length;
	}

}
