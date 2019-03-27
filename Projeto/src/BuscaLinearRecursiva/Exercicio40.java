package BuscaLinearRecursiva;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		// Faz uma busca linear
		
		char vetor[] = new char[10];
		Scanner ler = new Scanner(System.in);	
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um caracter ");
			char caracter = ler.next().charAt(0);
			vetor[i] = caracter;
		}
		
		System.out.print("Digite o caracter buscado ");
		char busca = ler.next().charAt(0);
		
		//passa os paramentro vetor, a busca e um contador
		System.out.println(buscaLinearRecursiva(vetor, busca, 0));
		
	}

	public static int buscaLinearRecursiva(char [] lista, char busca, int i) {
		//cria uma variavel para armazear o maior indice
		int maior = -1;
		//faz uma busca na lita
		if(i < lista.length) {
			//verifica se o numero na posicao i da lista é igual ao numero buscado
			if(lista[i] == busca) {
				//verifica se o indice onde o numero foi encontrado é maior que o indice anterior
				if(i > maior) {
					maior = i;
					if(i < lista.length) return buscaLinearRecursiva(lista, busca, i + 1);
				}
			}
			else return buscaLinearRecursiva(lista, busca, i + 1);
		}
		return maior;	
	}

}
