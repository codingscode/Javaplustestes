package programa;

import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);

	   int a = 3;
	   int k = 10;
	   
	   double b = 2*a;
	   double w = 100/k;
	   
	   System.out.println("a: " + a);
	   System.out.println("b: " + b);
	   System.out.println("w: " + w);
	   
	}

}
/*
a: 3
b: 6.0
w: 10.0


 */