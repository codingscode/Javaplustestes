package programa;

public class Carro implements Comparable {

	public String marca;
	public String modelo;
	public int ano;

	public Carro(String m, String mo, int a) {
		marca = m;
		modelo = mo;
		ano = a;
    }

	// Decide how this object compares to other objects
	public int compareTo(Object obj) {
		Carro outro = (Carro) obj;
		
	    if (ano < outro.ano) return -1; // This object is smaller than the other one
	    
	    if (ano > outro.ano) return 1;  // This object is larger than the other one
	    
	    return 0; // Both objects are the same
		
	}
	
        

}
