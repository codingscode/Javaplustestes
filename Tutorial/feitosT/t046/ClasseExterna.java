package programa;

public class ClasseExterna {
	int x = 10;
	
	/*
	uma classe interna pode tambem ser static, o que significa vc pode acessa-la sem criar
	um objeto da classe ClasseExterna
	*/
	static class ClasseInterna {
		int y = 5;
	}
}
