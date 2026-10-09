package programa;

import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);

	   int a, b;
	   double divisao;
	   
	   a = 5;
	   b = 2;
	   divisao = a/b;
	   
	   System.out.println("divisao: " + divisao);
	   
	   divisao = (double) a/b; // cast
	   System.out.println("divisao: " + divisao);
	   
	   
	}

}
/*
divisao: 2.0
divisao: 2.5
 

*/