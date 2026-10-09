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
		Date entrada = sdf.parse("23/09/2026");
		Date saida = sdf.parse("26/09/2026");

		if (!saida.after(entrada)){
			System.out.println("erro na reserva: data de saida deve ser depois da data de entrada");
		}
		else {
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva);

			System.out.println();
			System.out.println("digite data atualizar reserva.");
			entrada = sdf.parse("24/09/2026");
			saida = sdf.parse("29/09/2026");

			String erro = reserva.atualizarDatas(entrada, saida);
			if (erro != null){
				System.out.println("erro na reserva: " + erro);
			}
			else {
				System.out.println("Reserva: " + reserva);
			}

		}


		System.out.println();
	}
	

}
/*
Reserva: Quarto 8021, entrada: 23/09/2026, saida: 26/09/2026, 3 noites

digite data atualizar reserva.
Reserva: Quarto 8021, entrada: 24/09/2026, saida: 29/09/2026, 5 noites






------------------------------------
solução ruim


*/
