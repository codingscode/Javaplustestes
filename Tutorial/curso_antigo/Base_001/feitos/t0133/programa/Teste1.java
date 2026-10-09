package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Object> meusObjs = new ArrayList<Object>();
		meusObjs.add("Maria");
		meusObjs.add("Alex");
		List<? super Number> meusNums = meusObjs;
		meusNums.add(10);
		meusNums.add(3.14);
		Number x = meusNums.get(0); // erro de compilacao
		System.out.println();
	}

}
/*
Area total: 40.84070

------------------------------------
curingas delimitados (bounded wildcards)

princípio get/put - covariância e contravariância


*/
