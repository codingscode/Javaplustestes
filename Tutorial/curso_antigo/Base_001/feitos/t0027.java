package programa;

import java.util.Arrays;

public class Teste1 {

	public static void main(String[] args) {
		
		String s = "batata maçã limão";
		String[] vetor = s.split(" ");
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(Arrays.toString(vetor));
	}

}
/*
batata
maçã
limão
[Ljava.lang.String;@659e0bfd



formatar: toLowerCase(), toUpperCase(),trim()
recortar: substring(inicio), substring(inicio,fim),
substituir: Replace(char,char),Replace(string,string)
Buscar: IndexOf, LastIndexOf
str.Split("")



*/
