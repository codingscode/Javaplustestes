package programa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		method2();

		System.out.println("fim do programa");
		System.out.println();
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
aladin mel lily
6
posição inválida
fim do programa

------------------------------------
pilha de chamadas de métodos


*/
