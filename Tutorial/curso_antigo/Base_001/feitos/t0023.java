package programa;

public class Teste1 {

	public static void main(String[] args) {
		
		int n = 5, soma = 0;
		
		for (int i=n; i >= 1; i--) {
			soma += i;
			System.out.println("i: " + i);
		}
		
		System.out.println("soma: " + soma);
		
	}

}
/*
i: 5
i: 4
i: 3
i: 2
i: 1
soma: 15


*/
