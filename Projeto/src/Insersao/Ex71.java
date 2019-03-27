package Insersao;

import java.util.Scanner;

public class Ex71 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double [] vetor = new double [20];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º caracter ");
			vetor[i] = ler.nextDouble();
		}
		
		System.out.println("O vetor ordenado fica");
		double [] resposta = ordernar(vetor);
		for(int i = 0; i < resposta.length; i++) {
			System.out.print(resposta[i] + " ");
		}
	}

	public static double [] ordernar(double [] vetor) {
		int j;
		double x;
		
		for(int i = vetor.length - 1; i > 0; i--) {
			x = vetor[i];
			j = i - 1;
			while( j >= 0 && vetor[j] < x) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = x;
		}		
		return vetor;
	}
}
