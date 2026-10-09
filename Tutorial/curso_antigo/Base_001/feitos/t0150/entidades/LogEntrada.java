package entidades;

import java.util.Date;
import java.util.Objects;

public class LogEntrada {
	private String nomeusu;
	private Date momento;
	
	public LogEntrada(String nomeusu, Date momento) {
		this.nomeusu = nomeusu;
		this.momento = momento;
	}

	public String getNomeusu() {
		return nomeusu;
	}

	public void setNomeusu(String nomeusu) {
		this.nomeusu = nomeusu;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeusu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntrada other = (LogEntrada) obj;
		return Objects.equals(nomeusu, other.nomeusu);
	}
	
}
