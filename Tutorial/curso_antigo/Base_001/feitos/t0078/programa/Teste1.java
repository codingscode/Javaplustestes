package programa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inicio");

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
		System.out.println("fim do programa");

		System.out.println();
		
	}

}
/*
inicio
aladin mel lily
a
erro de entrada
fim do programa


inicio
aladin mel lily
5
posição inválida
fim do programa




------------------------------------
estrutura try-catch


*/
