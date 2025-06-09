package br.ucsal.esw;

import java.util.Random;
import java.util.Scanner;

public class ExMatrizEsw2 {

	public static void main(String[] args) {
		
		// criação da estrutura do código
		
		String[] nomes = new String[5];
		float[][] notas = new float[5][3];
		Scanner read = new Scanner (System.in);
		
		// preenchimento dos nomes e notas de cada aluno
		
		for (int i = 0; i < notas.length; i++) {
			nomes[i] = read.nextLine();
			read.nextLine();
			for (int j = 0; j < notas[i].length; j++) {
				
			}
		}
		read.close();
	}
	

}
