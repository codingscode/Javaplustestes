package programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // metodos Scanner
		// .useDelimiter(), .hasNextBoolean(), 
		
		Locale.setDefault(Locale.US); 
		
		try {
		   File meu_objeto = new File("./src/programa/arquivo.txt");
		   Scanner meu_leitor = new Scanner(meu_objeto);
		   
		   while (meu_leitor.hasNextLine()) {
		      String dados = meu_leitor.nextLine();
		      System.out.println(dados);
		   }
		   meu_leitor.close();
		}
		catch (FileNotFoundException e) {
		   System.out.println("um erro ocorreu.");
		   e.printStackTrace();
		}
				
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}

}

/*
aladim
mel
lily
fim.
--------------------------
tempo execução em ms: 37








*/
