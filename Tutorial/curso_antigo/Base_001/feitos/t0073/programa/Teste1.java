package programa;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Teste1 {

	public static void main(String[] args) {
		Conta x = new Conta(1001, "Aladim", 1000.0);
		Conta y = new ContaPoupanca(1002, "Mel", 1000.0, 0.01);
		
		x.sacar(50.0);
		y.sacar(50.0);

		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());

		System.out.println();

	}

}
/*
945.0
950.0





------------------------------------
pilares da oop
-encapsulamento
-herança
-polimorfismo




*/
