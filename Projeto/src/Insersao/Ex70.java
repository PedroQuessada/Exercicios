package Insersao;

import java.util.Scanner;

public class Ex70 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor ");
		int tamanho = ler.nextInt();
		
		int [] vetor = new int [tamanho];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º caracter ");
			vetor[i] = ler.nextInt();
		}
		
		System.out.println("O vetor ordenado fica");
		int [] resposta = ordernar(vetor);
		for(int i = 0; i < resposta.length; i++) {
			System.out.print(resposta[i] + " ");
		}
	}

	public static int [] ordernar(int [] vetor) {
		int x, j;
		
		for(int i = 1; i < vetor.length; i++) {
			x = vetor[i];
			j = i - 1;
			while( j >= 0 && vetor[j] > x) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = x;
		}		
		return vetor;
	}
	
}
