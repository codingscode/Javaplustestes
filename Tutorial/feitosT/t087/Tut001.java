package programa;

import java.util.HashMap;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// chave valor
		HashMap<String, String> capitalPais = new HashMap<String, String>();

	    capitalPais.put("inglaterra", "londres");
		capitalPais.put("alemanha", "berlim");
		capitalPais.put("noruega", "oslo");
		capitalPais.put("eua", "washington");

		System.out.println(capitalPais);
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*
{inglaterra=londres, eua=washington, alemanha=berlim, noruega=oslo}
--------------------------
tempo execução em ms:
0






*/
