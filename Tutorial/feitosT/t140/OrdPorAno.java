package programa;

import java.util.Comparator;

public class OrdPorAno implements Comparator{

	public int compare(Object obj1, Object obj2) {
		Carro a = (Carro) obj1;
		Carro b = (Carro) obj2;
		
		// Compare the year of both objects
		if (a.ano < b.ano) return -1;
	    if (a.ano > b.ano) return 1;
	    return 0;
	}
	
	
	
	
	
	
}
