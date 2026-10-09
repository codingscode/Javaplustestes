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
		//datas
		Date entrada = sdf.parse("20/09/2019");
		Date saida = sdf.parse("26/09/2019");

		if (!saida.after(entrada)){
			System.out.println("erro na reserva: data de saida deve ser depois da data de entrada");
		}
		else {
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva);

			System.out.println();
			System.out.println("digite data atualizar reserva.");
			entrada = sdf.parse("19/09/2019");
			saida = sdf.parse("30/09/2019");

			reserva.atualizarDatas(entrada, saida);
			System.out.println("Reserva: " + reserva);
		}

		System.out.println();
	}


}
/*
Reserva: Quarto 8021, entrada: 20/09/2019, saida: 26/09/2019, 6 noites

digite data atualizar reserva.
Reserva: Quarto 8021, entrada: 19/09/2019, saida: 30/09/2019, 11 noites





------------------------------------
bloco finally


*/
