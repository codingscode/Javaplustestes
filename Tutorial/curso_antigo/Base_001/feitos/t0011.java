package programa;

import java.util.Locale;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   
	   Scanner sc = new Scanner(System.in);
	   double x;

	   System.out.println("digite numero double:");
       x = sc.nextDouble();
       
       System.out.println("vc digitou: " + x);

       sc.close();
	   
	}

}
/*
digite numero double:
2.5
vc digitou: 2.5
 

*/