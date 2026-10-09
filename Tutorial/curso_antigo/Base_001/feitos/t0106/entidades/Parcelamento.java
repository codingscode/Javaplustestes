package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate data;
	private Double quantidade;
	
	public Parcelamento(){
	}

	public Parcelamento(LocalDate data, Double quantidade) {
		this.data = data;
		this.quantidade = quantidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return data.format(fmt) + " - " + String.format("%.2f", quantidade);
	}
	
	
	
	
}
