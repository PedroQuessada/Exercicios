package Insersao;

import java.util.Scanner;

public class Ex73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		char [] vetor = new char [10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º caracter ");
			vetor[i] = ler.next().charAt(0);
		}
		System.out.println("Digite o caracter que voce procura");
		char busca = ler.next().charAt(0);
		
		int resposta = buscar(vetor, busca);
		System.out.println("O caracter buscado esta na posicao " + resposta);	
		
	}
	
	public static int buscar(char [] vetor, char busca) {
		char [] respostaVetor  = ordenar(vetor);
		int inicio = 0;
		int fim = vetor.length - 1;
		return procurar(respostaVetor, busca, inicio, fim);
	}

	public static char [] ordenar(char [] vetor) {
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
	
	public static int procurar(char [] vetor, char busca, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		if(vetor[meio] == busca) return meio;
		if(vetor[meio] > busca) return procurar(vetor, busca, inicio, meio - 1);
		if(vetor[meio] < busca) return procurar(vetor, busca, meio + 1, fim);
		else return -1;
	}

}
