package programa;

import java.util.Locale;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   
	   Scanner sc = new Scanner(System.in);
	   int x;

	   System.out.println("digite numero inteiro:");
       x = sc.nextInt();
       
       System.out.println("vc digitou: " + x);

       sc.close();
	   
	}

}
/*
digite algo:
aladin
vc digitou: aladin
 

*/