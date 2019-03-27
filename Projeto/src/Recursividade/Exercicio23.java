package Recursividade;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		//Fazer um vetor de 10 e calcular a soma de todos os numeros

		int[] vetor = new int[10];
		Scanner ler = new Scanner(System.in);	
		int numero;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero ");
			numero = Integer.parseInt(ler.next());
			vetor[i] = numero;
			
		}
		
		System.out.print("A soma dos numeros é: " + Soma(vetor, 0));
	
	}
	
	public static int Soma(int[] vetor, int i) {
		if(i < vetor.length) {
			return vetor[i] + Soma(vetor, i + 1);
		}
		else return 0;
	}

}
