package programa;

public class Generico<T> {
	T valor; // T é um espaço reservado para qualquer tipo de dado

	void set(T valor) {
		this.valor = valor;
	}

	T get() {
		return valor;
	}
}
