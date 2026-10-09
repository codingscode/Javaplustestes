package programa;

import java.util.Locale;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);

	   Scanner sc = new Scanner(System.in);
	   
	   String str;
	   int x;
	   double y;
	   
	   System.out.println("digite string:");
       str = sc.next();
       
       System.out.println("digite inteiro:");
       x = sc.nextInt();
       
       System.out.println("digite double:");
       y = sc.nextDouble();
       
       
       System.out.println("string: " + str + ", inteiro: " + x + ", double: " + y);
       
       sc.close();
	   
	}

}
/*
digite string:
borboleta
digite inteiro:
3
digite double:
2.5
string: borboleta, inteiro: 3, double: 2.5


*/
