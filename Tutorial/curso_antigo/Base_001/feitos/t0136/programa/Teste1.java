package programa;

import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String a = "maria";
		String b = "mario";
		String c = "maria";

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());

		System.out.println();
	}

}
/*
103666422
103666436
103666422
 
------------------------------------
hashcode e equals



*/
