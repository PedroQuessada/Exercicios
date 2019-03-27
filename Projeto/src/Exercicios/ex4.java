package Exercicios;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char vetor[] = new char[26];
		int posicao = 0;
		
		for(char a = 'a'; a <= 'z'; a++) {
			vetor[posicao] = a;
			posicao++;
		}
		
		for(int cont = 0; posicao % 2 != 0; cont++) {
			char aux;
			aux = vetor[posicao];
			vetor[posicao] = vetor[posicao++];
			vetor[posicao++] = aux;
			
		}

		for(char ab : vetor) {
			System.out.print(ab + "\n");
		}
		
		
		
	}

}
