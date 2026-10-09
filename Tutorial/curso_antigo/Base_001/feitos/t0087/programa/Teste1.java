package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entidades.Reserva;

public class Teste1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			// numero quarto
			int numero = 8021;
			// datas
			Date entrada = sdf.parse("23/09/2026");
			Date saida = sdf.parse("26/09/2026");

			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("digite data atualizar reserva.");
			entrada = sdf.parse("24/09/2024");
			saida = sdf.parse("29/09/2024");

			reserva.atualizarDatas(entrada, saida);
			System.out.println("Reserva: " + reserva);
		}
		catch (ParseException e) {
			System.out.println("formato de data inválido");
		}
		catch(IllegalArgumentException e){
			System.out.println("erro na reserva: " + e.getMessage());
		}
		System.out.println();
	}

}
/*
Reserva: Quarto 8021, entrada: 23/09/2026, saida: 26/09/2026, 3 noites

digite data atualizar reserva.
erro na reserva: erro na reserva: datas reserva para atualizar devem ser futuras!




 ------------------------------------
 solução boa
 

 * 
 */
