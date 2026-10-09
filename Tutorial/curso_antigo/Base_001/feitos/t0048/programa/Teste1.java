package programa;

import java.util.Locale;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// String[] vetor = {"maria", "omar", "shirley"};
		
		String[] vetor = new String[] {"maria", "omar", "shirley"};

		for (String cada : vetor) {
			System.out.println(cada);
		}		
		
	}

}
/*
maria
omar
shirley

------------------------------------
for each

*/
