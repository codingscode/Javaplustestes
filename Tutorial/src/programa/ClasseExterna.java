package programa;

public class ClasseExterna {
	int x = 10;
	
	class ClasseInterna {
		public int metodoInterno() {
			return x;
		}
		
	}
}

/*
uma classe interna pode tambem ser static, o que significa vc pode acessa-la sem criar
um objeto da classe ClasseExterna
*/

