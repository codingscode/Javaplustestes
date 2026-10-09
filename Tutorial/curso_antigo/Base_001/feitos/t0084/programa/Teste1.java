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
		Date entrada = sdf.parse("23/09/2019");
		Date saida = sdf.parse("26/09/2019");

		if (!saida.after(entrada)){
			System.out.println("erro na reserva: data de saida deve ser depois da data de entrada");
		}
		else {
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("digite data atualizar reserva.");
			entrada = sdf.parse("24/09/2019");
			saida = sdf.parse("22/09/2019");
			
			Date agora = new Date();
			if (entrada.before(agora) || saida.before(agora)){
				System.out.println("erro na reserva: datas reserva para atualizar devem ser futuras!");
			}
			else if (!saida.after(entrada)){
				System.out.println("erro na reserva: data de saida deve ser depois da data de entrada");
			}
			else {
				reserva.atualizarDatas(entrada, saida);
				System.out.println("Reserva: " + reserva);
			}

		}

		
		System.out.println();
	}
	

}
/*
Reserva: Quarto 8021, entrada: 23/09/2019, saida: 26/09/2019, 3 noites

digite data atualizar reserva.
erro na reserva: datas reserva para atualizar devem ser futuras!




------------------------------------
solução muito ruim


*/
