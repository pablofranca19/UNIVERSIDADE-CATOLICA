package exerciciosLPA;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int vetor[] = new int [10];
		
		System.out.println("Digite os 10 números:");
		
		for (int i = 0; i <= vetor.length; i++) {
			vetor[i] = read.nextInt();
		}
		
		String retorno = OrdemInversa();
		System.out.println(retorno);
		
		read.close();

	}
	
		public static int OrdemInversa (int[] vetor) {
			
			
			System.out.println("A ordem inversa dos valores sao: ");
			for (int j = 0; j <= vetor.length; j--) {
				System.out.println(vetor[j]);
			}
			
			
			return 0;
		}

}
