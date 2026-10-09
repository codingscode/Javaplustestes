package programa;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("nomeusuario", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("fone", "99711122");

		System.out.println(cookies);
		imprimir(cookies);
		System.out.println();

		cookies.remove("email");
		System.out.println(cookies);
		imprimir(cookies);
		System.out.println();

		cookies.put("fone", "222222222"); // sobrescreve se já existe
		System.out.println(cookies);
		imprimir(cookies);
		System.out.println();

		System.out.println("contém a chave fone: "+ cookies.containsKey("fone"));
		System.out.println("numero fone: " + cookies.get("fone"));
		System.out.println("email: " + cookies.get("email"));
		System.out.println("tamanho: " + cookies.size()  );
		
		System.out.println();
	}

	public static void imprimir(Map<String, String> algo) {
		for (String chave : algo.keySet()) {
			System.out.println(chave + ": " + algo.get(chave));
		}
	}

}


/*
{email=maria@gmail.com, fone=99711122, nomeusuario=maria}
email: maria@gmail.com
fone: 99711122
nomeusuario: maria

{fone=99711122, nomeusuario=maria}
fone: 99711122
nomeusuario: maria

{fone=222222222, nomeusuario=maria}
fone: 222222222
nomeusuario: maria

contém a chave fone: true
numero fone: 222222222
email: null
tamanho: 2



------------------------------------
Map<K, V>
pares chave valor


implementações: hashmap, treemap, linkedhashmap



*/
