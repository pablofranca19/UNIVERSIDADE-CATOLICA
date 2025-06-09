package exerciciosLPA;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int[] vetor10 = new int [10];

		Scanner read = new Scanner(System.in);
		
		for (int i = 0; i <= vetor10.length; i++) {
			vetor10[i] = read.nextInt();
		}
		
		int resultado = Devolver();
		System.out.println(resultado);
		
		read.close();
	}
	
	
	public static String Devolver (int[] vetor10, int i) {
		
		for (i = 0; i <= vetor10[i]; i++) {
			System.out.println(vetor10[i]);
		}
		
		
		
		return null;
	}

}
