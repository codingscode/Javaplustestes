package programa;

import entidades.Triangulo;

public class Teste1 {

	public static void main(String[] args) {
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		x.a = 3;
		x.b = 4;
		x.c = 5;
		double p1 = x.perimetro();
		
		y.a = 6;
		y.b = 8;
		y.c = 10;
		double p2 = y.perimetro();
				
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
	}
	
	

}
/*
p1: 12.0
p2: 24.0


classe :
   atributos-> dados
   métodos->funções/operações




*/
