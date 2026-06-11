package programa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
	    
	    	    
	    // Copy image.jpg into copy.jpg
	    try (FileInputStream entrada = new FileInputStream("./src/programa/bitcoin-dourado.jpg");
	         FileOutputStream saida = new FileOutputStream("./src/programa/outro.jpg")) {

	      int i;
	      while ((i = entrada.read()) != -1) {
	        saida.write(i);  // write the raw byte to the new file
	      }

	      System.out.println("arquivo copiado com sucesso.");
        }
	    catch (IOException e) {
	      System.out.println("erro ao manipular arquivo.");
	    }
	    
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







*/
