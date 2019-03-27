package Insersao;

import java.util.Scanner;

public class Ex72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		char [] vetor = new char [5];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "� caracter ");
			vetor[i] = ler.next().charAt(0);
		}
		
		System.out.println("foram necessarias " + contador(vetor) + " ordena��es");
		
		System.out.println("O vetor ordenado fica");
		char [] resposta = ordernar(vetor);
		for(int i = 0; i < resposta.length; i++) {
			System.out.print(resposta[i] + " ");
		}
		
		
		
		
	}

	public static int contador(char [] vetor) {
		int j;
		int contador = 0;
		char x;
		
		for(int i = 1; i < vetor.length; i++) {
			x = vetor[i];
			j = i - 1;
			while( j >= 0 && vetor[j] > x) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
				contador++;
			}
			vetor[j + 1] = x;
		}		
		return contador;
	}
	
	public static char [] ordernar(char [] vetor) {
		int j;
		char x;
		
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
