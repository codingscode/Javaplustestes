package programa;

import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
	   double k = 3.56721;

	   System.out.println(k);
	   System.out.printf("%.2f%n", k);
	   System.out.printf("%.3f%n", k);

	   Locale.setDefault(Locale.US);
	   System.out.printf("%.3f%n", k);
	}

}
