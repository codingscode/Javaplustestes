package programa;

public class Teste1 {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("original: |" + original + "|");
		System.out.println("s01:      |" + s01 + "|");
		System.out.println("s02:      |" + s02 + "|");
		System.out.println("s03:      |" + s03 + "|");
		System.out.println("s04:      |" + s04 + "|");
		System.out.println("s05:      |" + s05 + "|");
		System.out.println("s06:      |" + s06 + "|");
		System.out.println("s07:      |" + s07 + "|");
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		


	}

}
/*
original: |abcde FGHIJ ABC abc DEFG    |
s01:      |abcde fghij abc abc defg    |
s02:      |ABCDE FGHIJ ABC ABC DEFG    |
s03:      |abcde FGHIJ ABC abc DEFG|
s04:      |cde FGHIJ ABC abc DEFG    |
s05:      |cde FGH|
s06:      |xbcde FGHIJ ABC xbc DEFG    |
s07:      |xyde FGHIJ ABC xy DEFG    |
i: 1
j: 17





formatar: toLowerCase(), toUpperCase(),trim()
recortar: substring(inicio), substring(inicio,fim),
substituir: replace(char,char),replace(string,string)
Buscar: IndexOf, LastIndexOf
str.Split("")



*/
