package programa;

import java.util.Comparator;

public class OrdParPrimeiro implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		// certificar que os objetos são inteiros
	    Integer a = (Integer) obj1;
	    Integer b = (Integer) obj2;
	    
	    // certificar se cada número é par
	    boolean aEPar = (a % 2) == 0;
	    boolean bEPar = (b % 2) == 0;
	    
	    if (aEPar == bEPar) {
	      // se ambos os número sao pares ou ambos impares então use regras de ordenamento normal
	      if (a < b) return -1;
	      if (a > b) return 1;
	      return 0;
	    }
	    else {
	      // se a é par então isso vai antes, senão b vai primeiro
	      if (aEPar) {
	      	return -1;
	      }
	      else {
	        return 1;
	      }
	    }
		
		
	}

}
