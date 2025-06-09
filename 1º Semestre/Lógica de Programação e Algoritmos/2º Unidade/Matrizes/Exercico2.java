package projeto;

import java.util.Random;

public class Exercico2 {
	public static void main(String[] args) {
	
	
	Random aleatorio = new Random (100);	
	int Matriz [][] = new int [10][10];

	
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz.length; j++) {
				Matriz[i][j] = aleatorio.nextInt();			
			}
		}
		
		int num = aleatorio.nextInt();
		
	System.out.println("Quantidade: " + quantidadeAparece(Matriz, num));	
		
	}

	public static int quantidadeAparece (int [][] Matriz, int num) {
	
		int cont = 0;
		
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz.length; j++) {
				if (Matriz[i][j] == num) {
					cont++;
					}
				}
			}
		return cont;
	}
}

		

	
