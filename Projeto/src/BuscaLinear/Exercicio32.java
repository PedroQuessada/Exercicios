package BuscaLinear;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = new int[15];
		Scanner ler = new Scanner(System.in);	
		
		for(int i = 0; i < 15; i++) {
			System.out.print("Digite um numero ");
			int numero = Integer.parseInt(ler.next());
			vetor[i] = numero;
		}
		
		System.out.print("Digite o numero buscado ");
		int busca = Integer.parseInt(ler.next());
		
		
		System.out.println(buscaLinear(vetor, busca));
		
	}

	public static int buscaLinear(int [] lista, int busca) {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] == busca) {
				return i;
			}
		}
		return -1;
	}
	
}