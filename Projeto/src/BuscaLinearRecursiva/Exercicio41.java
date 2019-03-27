package BuscaLinearRecursiva;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		// Faz uma busca linear
		
		int vetor[] = new int[10];
		Scanner ler = new Scanner(System.in);	
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero ");
			int numero = Integer.parseInt(ler.next());
			vetor[i] = numero;
		}
		
		System.out.print("Digite o numero buscado ");
		int busca = Integer.parseInt(ler.next());
		
		//passa os paramentro vetor, a busca e um contador
		int maior = -1;
		System.out.println(busca(vetor, busca));
		
	}
	
	public static int busca(int [] lista, int busca) {
		int maior = -1;
		int i = 0;
		return buscaLinearRecursiva(lista, busca, i, maior);
	}
		
	public static int buscaLinearRecursiva(int [] lista, int busca, int i, int maior) {
		//faz uma busca na lita
		if(i < lista.length) {
			//verifica se o numero na posicao i da lista é igual ao numero buscado
			if(lista[i] == busca) {
				//verifica se o indice onde o numero foi encontrado é maior que o indice anterior
				if(maior < i) {
					maior = i;
					//se mesmo encontrando o numero, o i for menor que o vetor ele chama a funcao novamente
					//isso faz com que a funcao percora todo o vetor, mesmo que ache o numero
					if(i < lista.length)  return buscaLinearRecursiva(lista, busca, i + 1, maior);					
				}
			}
			//se nao for encontrado o numero buscado na posicao i, ele retorna o metodo somando um no i
			else return buscaLinearRecursiva(lista, busca, i + 1, maior);
		}
		return maior;	
	}

}
