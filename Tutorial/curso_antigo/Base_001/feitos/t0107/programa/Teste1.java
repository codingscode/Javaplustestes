package programa;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Teste1 {

	public static void main(String[] args) {
		Forma s1 = new Circulo(Cor.PRETO, 2.0);
		Forma s2 = new Retangulo(Cor.AZUL, 3.0, 4.0);


		System.out.println("Cor Circulo: " + s1.getCor());
		System.out.println("Area Circulo: " + String.format("%.3f", s1.area()));
		System.out.println("Cor Retangulo: " + s2.getCor());
		System.out.println("Area Retangulo: " + String.format("%.3f", s2.area()));
		
		System.out.println();
	}

}
/*
Cor Circulo: PRETO
Area Circulo: 12,566
Cor Retangulo: AZUL
Area Retangulo: 12,000



 ------------------------------------
herdar x cumprir contrato:
herança -> reuso
interface -> contrato a ser cumprido


combinação interface + classe abstrata



 */
