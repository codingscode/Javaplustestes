package programa;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entidades.Reserva;

public class Teste1 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//numero quarto
		int numero = 8021;
		Date entrada = sdf.parse("26/09/2019");
		Date saida = sdf.parse("20/09/2019");
		
		if (!saida.after(entrada)){
			System.out.println("erro na reserva: data de saida deve ser depois da data de entrada");
		}
		else {
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva);
		}

		System.out.println();
	}
	

}
/*
sem erro
Reserva: Quarto 8021, entrada: 23/09/2019, saida: 26/09/2019, 3 noites



com erro
erro na reserva: data de saida deve ser depois da data de entrada




------------------------------------
bloco finally


*/
