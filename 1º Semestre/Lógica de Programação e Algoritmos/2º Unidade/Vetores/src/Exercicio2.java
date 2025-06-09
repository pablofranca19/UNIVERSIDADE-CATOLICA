package exerciciosLPA;

import java.util.Scanner;	

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		int v1[] = new int [10];
		int v2[] = new int [10];
		
		
		System.out.println(SomaVetor());
	

	}
	
	public static String SomaVetor(int[] v1, int[] v2) {
		
		Scanner read = new Scanner(System.in);
		
		int k;
		int vSoma[] = new int [10];
		
		for (int i = 0; i <= v1.length; i++) {
			System.out.println("Informe os 10 numeros em sequencia: ");
			read.nextLine();
			v1[i] = read.nextInt();
		}
		
		
		for (int j = 0; j <= v2.length; j++) {
			System.out.println("Informe os 10 numeros em sequencia: ");
			read.nextLine();
			v2[j] = read.nextInt();
		}
		
		
		for (k = 0; k <= vSoma.length; k++) {
			
			vSoma[k] = v1[k] + v2[k];
			
			System.out.println("A soma dos elementos de mesmo indice sao: ");
			read.nextLine();
			System.out.println("Vetor " + k + ":" + vSoma[k]);
		}
		
		
		return "Vetor " + k + ":" + vSoma[k];
		
		read.close();
	} 
	

}
