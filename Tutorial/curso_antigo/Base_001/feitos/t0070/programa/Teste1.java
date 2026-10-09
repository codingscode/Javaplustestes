package programa;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Teste1 {

	public static void main(String[] args) {
		Conta c = new Conta(1001, "Aladim", 0.0);
		ContaEmpresa ce = new ContaEmpresa(1002, "Mel", 0.0, 500.0);

		//upcasting
		Conta c1 = ce;
		//c1.getSaldo();
		Conta c2 = new ContaEmpresa(1003, "Lily", 0.0, 200.0);
		Conta c3 = new ContaPoupanca(1004, "Liu", 0.0, 0.01);

		//downcasting
		ContaEmpresa c4 = (ContaEmpresa) c2;
		c4.emprestimo(100.0);
		//ContaEmpresa c5 = (ContaEmpresa) c3; // dá erro
		if (c3 instanceof ContaEmpresa){
			ContaEmpresa c5 = (ContaEmpresa) c3;
			c5.emprestimo(200.0);
			System.out.println("emprestimo!");
		}
		if (c3 instanceof ContaPoupanca){
			ContaPoupanca c5 = (ContaPoupanca) c3;
			c5.atualizarSaldo();
			System.out.println("atualizado!");
		}

		System.out.println();

	}

}
/*
atualizado!


------------------------------------
Herança
Upcasting e downcasting



*/
