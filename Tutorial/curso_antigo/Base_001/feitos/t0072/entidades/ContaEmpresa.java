package entidades;


public class ContaEmpresa extends Conta{
	private Double limiteSaque;
	
	public ContaEmpresa(){
		super();
	}
	
	public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteSaque) {
		super(numero, titular, saldo);
		this.limiteSaque = limiteSaque;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void emprestimo(double quantidade){
		if (quantidade <= limiteSaque){
			saldo += quantidade - 10.0;
		}
	}

	@Override
	public void sacar(double quantidade){
		super.sacar(quantidade);
		saldo -= 2.0;
	}
	
	
}
