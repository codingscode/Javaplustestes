package programa;

import java.util.Locale;

import entidades.Cliente;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String s1 = "test";
		String s2 = "test";
		String s3 = new String("test");
		String s4 = new String("test");

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

		System.out.println();
	}

}
/*
true
false

 
------------------------------------
hashcode e equals



*/
