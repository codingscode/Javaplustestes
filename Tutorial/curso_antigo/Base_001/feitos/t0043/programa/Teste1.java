package programa;

import java.util.Locale;



public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int a, b;
		a = 3;
		b = a;
		
		System.out.println("a: " + a + ", b: " + b);
		b = 5;
		System.out.println("a: " + a + ", b: " + b);
		a = 7;
		System.out.println("a: " + a + ", b: " + b);
	}


}
/*

stack vs heap

valor null aponta para ninguém
tipos primitivos são tipos valor
tipos valor são Caixas e não ponteiros


------------------------------------------
a: 3, b: 3
a: 3, b: 5
a: 7, b: 5



*/
