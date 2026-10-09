package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Teste1 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem");
		Comentario c2 = new Comentario("Muito bom");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "viajando para canada", "estou indo lá", 14);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		Comentario c3 = new Comentario("Tenha Sucesso!");
		Comentario c4 = new Comentario("Deve ser legal");
		Post p2 = new Post(sdf.parse("23/07/2018 18:07:44"), "viajando para rs", "lá é frio", 8);
		
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);

		System.out.println(p1);
		System.out.println(p2);

	}

}
/*
viajando para canada
14 Likes - 21/06/2018 13:05:44
estou indo lá
Comentários:
Tenha uma boa viagem
Muito bom

viajando para rs
8 Likes - 23/07/2018 18:07:44
lá é frio
Comentários:
Tenha Sucesso!
Deve ser legal





------------------------------------




*/
