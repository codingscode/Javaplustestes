package programa;

import java.util.Locale;

import entidades.Cliente;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Cliente c1 = new Cliente("maria", "maria@gmail.com");
		Cliente c2 = new Cliente("bob", "bob@gmail.com");
		Cliente c3 = new Cliente("maria", "maria@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1 == c3);

		System.out.println();
	}

}
/*
-572735952
1096343760
-572735952
false
true
false

 
------------------------------------
hashcode e equals



*/
