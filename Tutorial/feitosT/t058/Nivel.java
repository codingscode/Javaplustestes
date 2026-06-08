package programa;

public enum Nivel {

	// constantes enum (cada uma tem sua propria descrição)
	BAIXO("baixo nivel"),
	MEDIO("medio nivel"),
	ALTO("alto nivel");
	
	// campo(variavel) para guardar o texto de descrição
	private String descricao;
	
	// construtor executa uma vez para cada constante acima
	private Nivel(String descricao) {
		this.descricao = descricao;
	}
	
	// metodo getter para ler descricao
	public String getDescricao() {
		return descricao;
	}
	
	

}
