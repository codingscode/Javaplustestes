package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int n = 3;
		int [][] mat = new int[n][n];
		int qnegativos = 0;
		
		mat[0][0] = 1;
		mat[0][1] = 2;
		mat[0][2] = -21;
		mat[1][0] = 4;
		mat[1][1] = 5;
		mat[1][2] = 6;
		mat[2][0] = -3;
		mat[2][1] = -10;
		mat[2][2] = 9;
		
		System.out.println("diagonal principal:");
		
		for (int i=0; i<mat.length;i++) {
			for (int j=0; j<mat[i].length;j++) {
				if (i == j){
					System.out.print(mat[i][j] + " ");
				}
				if (mat[i][j] < 0) {
					qnegativos += 1;
				}
			}
		}
				
		System.out.println();
		System.out.println("quantidade de números negativos: " + qnegativos);
	}

}
/*
diagonal principal:
1 5 9 
quantidade de números negativos: 3

------------------------------------
matrizes



*/
