package programa;

import java.util.Locale;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   
	   Scanner sc = new Scanner(System.in);
	   char x;

	   System.out.println("digite caractere:");
       x = sc.next().charAt(0);
       
       System.out.println("vc digitou: " + x);

       sc.close();
	   
	}

}
/*
digite caractere:
t
vc digitou: t

digite caractere:
tre
vc digitou: t


*/
