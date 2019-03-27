package BuscaLinear;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);	
		
		System.out.print("A quantidade de corredores: ");
		int numeroCorredores = Integer.parseInt(ler.next());
	
		int vetor[][] = new int [numeroCorredores][3];
		
		for(int i = 0; i<vetor.length; i++) {
			for(int j = 0; j<vetor[i].length; j++) {
				if(j == 0) {
					System.out.print("Digite a matricula ");
					vetor[i][j] = ler.nextInt();
				}
				if(j == 1) {
					System.out.print("Digite o tempo ");
					vetor[i][j] = ler.nextInt();
				}
				if(j == 2) {
					System.out.print("Digite a posicao ");
					vetor[i][j] = ler.nextInt();
				}
			}
		}
		
		System.out.print("A matricula que voce busca: ");
		int busca = Integer.parseInt(ler.next());
	
		String resposta = buscar(vetor, busca);
		
		if(resposta == null) {
			System.out.print("Não existe corredor com esse numero de matricula");
		}
		else {
			System.out.print(resposta);
		}
	}
	
	public static String buscar(int [][] vetor, int busca) {
		for(int i = 0; i<vetor.length; i++) {
			if(vetor[i][0] == busca) {
				if(vetor[i][0] == 0) {
					String resposta = "O corredor nao terminou a corrida!";
					return resposta;
				} 
				else {
					String resposta = "O corredor fez a corrida em  "+ vetor[i][1] + "segundos e chegou na posição " + vetor[i][2];
					return resposta;
				}
			}
		}
		return null;
	}
	
	
}