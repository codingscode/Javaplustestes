package programa;

import java.util.Locale;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int x = 20;
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		System.out.println(y);
		
	}


}
/*
20
20

------------------------------------
boxing, unboxing, wrapping classes

*/
