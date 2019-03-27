package BuscaLinearRecursiva;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// Faz uma busca linear
		
		int vetor[] = new int[10];
		Scanner ler = new Scanner(System.in);	
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero ");
			int numero = ler.nextInt();
			vetor[i] = numero;
		}
		
		System.out.print("Digite o numero buscado ");
		int busca = ler.nextInt();
		
		//passa os paramentro vetor, a busca e um contador
		System.out.println(busca(vetor, busca));
		
	}
	
	public static int busca(int [] lista, int busca) {
		//inicia um contador na posicao 1, a primeira posicao impar onde o algoritmo pode ser valido.
		int i = 1;
		return buscaLinearRecursiva(lista, busca, i);
	}

	public static int buscaLinearRecursiva(int [] lista, int busca, int i) {
		if(i < lista.length) {
			if(busca == lista[i]) {
				return i;
			}
			//soma-se mais 2 no valor i, pois ele sempre vai pular um numero par e ir para o proximo numero impar, 
			//nao precisando verificar se o resultado encontrado é um numero impar ou par
			else return buscaLinearRecursiva(lista, busca, i + 2);
		}
		else return -1;
	}
}