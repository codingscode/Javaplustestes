package entidades;


public class EmpregadoTerceirizado extends Empregado{
	private Double adicionalS;
	
	public EmpregadoTerceirizado(){
		super();
	}

	public EmpregadoTerceirizado(String nome, Integer horas, Double valorHora, Double adicionalS) {
		super(nome, horas, valorHora);
		this.adicionalS = adicionalS;
	}

	public Double getAdicionalS() {
		return adicionalS;
	}

	public void setAdicionalS(Double adicionalS) {
		this.adicionalS = adicionalS;
	}
	
	@Override
	public double pagamento(){
		return super.pagamento() + adicionalS*1.1;
	}

}
