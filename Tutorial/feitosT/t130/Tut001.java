package programa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// expressões regulares
		Pattern padrao = Pattern.compile("moleque", Pattern.CASE_INSENSITIVE);
	    Matcher correspondente = padrao.matcher("pé de moleque!");
	    boolean corresEncontrado = correspondente.find();
	    
	    if (corresEncontrado) {
	      System.out.println("correspondencia encontrada");
	    }
	    else {
	      System.out.println("correspondencia não encontrada");
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

correspondencia encontrada
--------------------------
tempo execução em ms:
0





Expression 	Description
[abc] 	Find one character from the options between the brackets
[^abc] 	Find one character NOT between the brackets
[0-9] 	Find one character from the range 0 to 9


Metacharacter 	Description
| 	Find a match for any one of the patterns separated by | as in: cat|dog|fish
. 	Find just one instance of any character
^ 	Finds a match at the beginning of a string as in: ^Hello
$ 	Finds a match at the end of the string as in: World$
\d 	Find a digit
\s 	Find a whitespace character
\b 	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
\uxxxx 	//Find the Unicode character specified by the hexadecimal number xxxx



//Quantifier 	Description
// n+ 	Matches any string that contains at least one n
// n* 	Matches any string that contains zero or more occurrences of n
// n? 	Matches any string that contains zero or one occurrences of n
// n{x} 	Matches any string that contains a sequence of X n's
// n{x,y} 	Matches any string that contains a sequence of X to Y n's
// n{x,} 	Matches any string that contains a sequence of at least X n's







*/
