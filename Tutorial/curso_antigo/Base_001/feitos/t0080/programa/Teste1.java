package programa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		System.out.println("inicio");
		method1();
		

		System.out.println("fim do programa");
		System.out.println();
	}
	
	public static void method1() {
		System.out.println("---- inicio method1 ----");
		method2();
		System.out.println("---- fim method1 ----");
	}
	
	public static void method2(){
		System.out.println("---- inicio method2 ----");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vet = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vet[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("posição inválida");
			e.printStackTrace();
		}
		catch (InputMismatchException e ) {
			System.out.println("erro de entrada");
		}
		
		sc.close();
		System.out.println("---- fim method2 ----");
	}

}
/*
inicio
---- inicio method1 ----
---- inicio method2 ----
aladin mel lily
5
posição inválida
---- fim method2 ----
---- fim method1 ----
fim do programa



inicio
---- inicio method1 ----
---- inicio method2 ----
aladin mel lily
5
posição inválida
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
---- fim method2 ----
---- fim method1 ----
fim do programa

	at programa.Teste1.method2(Teste1.java:30)
	at programa.Teste1.method1(Teste1.java:20)
	at programa.Teste1.main(Teste1.java:11)



------------------------------------
pilha de chamadas de métodos


*/
