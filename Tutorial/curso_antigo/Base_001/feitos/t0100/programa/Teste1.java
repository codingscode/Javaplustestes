package programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import model.entidades.AluguelCarro;
import model.entidades.Veiculo;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//dados do aluguel
		String modeloCarro = "civic";
		LocalDateTime inicio = LocalDateTime.parse("", fmt);
		LocalDateTime fim = LocalDateTime.parse("", fmt);
		
		AluguelCarro ac = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));
		
		
		System.out.println();
	}

}
/*



resolvendo sem interface
 ------------------------------------
interfaces
é um tipo que define um conjunto de operações que uma classe deve implementar
a interface estabelece um contrato que a classe deve cumprir

 

 * 
 */
