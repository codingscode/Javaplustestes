package entidades;

public class ContaPoupancaPlus extends ContaPoupanca{
	@Override
	public void sacar(double quantidade){
		saldo -= quantidade + 2.0;
	}
}
