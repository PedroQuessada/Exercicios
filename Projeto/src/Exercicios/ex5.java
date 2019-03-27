package Exercicios;
import java.util.Scanner;
import java.util.Arrays;


public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[26];
		int contador = 0;
		
		
		for(int i = 0; i < 16; i++) {
			System.out.print("Digite um numero: ");
			int o = Integer.parseInt(ler.next());
			vetor[i] = o;
		}
		
		for(int posicao = 0; posicao < 16; posicao++) {
			int posicaoUm = posicao;
			int posicaoDois = posicao + 1;
			int posicaoTres = posicao + 2;
			int posicaoQuatro = posicao + 3;
			
			if(vetor[posicaoUm] == vetor[posicaoQuatro] && vetor[posicaoDois]  == vetor[posicaoTres]) {
				contador++;
			}
			
			//System.out.println(vetor[posicao]);
		}
		
		System.out.println(contador);
	}

}
