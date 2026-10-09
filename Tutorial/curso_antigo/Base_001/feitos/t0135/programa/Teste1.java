package programa;

import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String a = "maria";
		String b = "mario";
		String c = "maria";

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

		System.out.println();
	}

}
/*
false
true

 
------------------------------------
hashcode e equals



*/
