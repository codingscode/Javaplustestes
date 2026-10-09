package programa;

import java.util.Locale;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		System.out.println("digite strings e aperte enter:");
		x = sc.nextInt();
		sc.nextLine(); // evita problema
		s1 = sc.nextLine(); // pega frase inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
/*
3
aladim
mel
lily
dados digitados:
3
aladim
mel
lily
*/
