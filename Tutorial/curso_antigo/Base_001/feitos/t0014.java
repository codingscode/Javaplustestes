package programa;

import java.util.Locale;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		System.out.println("digite strings e aperte enter:");
		s1 = sc.nextLine(); // pega frase inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
/*
bom dia
boa tarde
boa noite
dados digitados:
bom dia
boa tarde
boa noite

*/
