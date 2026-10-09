package programa;

import entidades.Triangulo;

public class Teste1 {

	public static void main(String[] args) {
		double p1, p2;
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		x.a = 3;
		x.b = 4;
		x.c = 5;
		
		y.a = 6;
		y.b = 8;
		y.c = 10;
		
		p1 = x.a + x.b + x.c;
		p2 = y.a + y.b + y.c;

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
