package programa;

import java.util.Locale;

import entidades.Conta;



public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Conta conta;

		int numero = 234;
		String titular = "Aladim"		;
		char resposta = 'n';
		
		if (resposta == 's') {
			double depinicial = 950.0;
			conta = new Conta(numero, titular, depinicial);
		}
		else {
			conta = new Conta(numero, titular);
		}

		System.out.println();
		System.out.println("dados da conta: ");
		System.out.println(conta);

		System.out.println();
		double valorDeposito = 400.00;
		conta.depositar(valorDeposito);
		System.out.println(conta);
		System.out.println();
		
		System.out.println();
		double retirar = 200.00;
		conta.sacar(retirar);
		System.out.println(conta);
		System.out.println();
		
		
		
	}


}
/*
modificadores de acesso
 
---------------------------
sim
dados da conta: 
Conta 234, titular: Aladim, saldo: R$ 950.00

Conta 234, titular: Aladim, saldo: R$ 1350.00

Conta 234, titular: Aladim, saldo: R$ 1145.00


nao
dados da conta: 
Conta 234, titular: Aladim, saldo: R$ 0.00

Conta 234, titular: Aladim, saldo: R$ 400.00

Conta 234, titular: Aladim, saldo: R$ 195.00


*/
