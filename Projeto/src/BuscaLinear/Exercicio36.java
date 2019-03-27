package BuscaLinear;
import java.util.Scanner;
public class Exercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero de alunos ");
		int qtdAlunos = ler.nextInt();
		int vetorRa[] = new int[qtdAlunos];
		double vetorNota[] = new double[qtdAlunos];
		char resposta;
		
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("Escolha uma das opções abaixo ");
			System.out.println("A) Cadastrar RA de todos os alunos matriculados.");
			System.out.println("B) Cadastrar NOTA de prova para todos os alunos matriculados ");
			System.out.println("C) Realizar a busca linear e apresentar a NOTA para um determinado RA, a ser digitado");
			System.out.println("D) Sair do programa ");
			System.out.println("--------------------------------------------------");
			resposta = ler.next().charAt(0);
			
			if(resposta == 'A') {
				for(int i = 0; i < vetorRa.length; i++) {
					System.out.print("Digite o numero RA ");
					vetorRa[i] = ler.nextInt();
				}
			}
			
			if(resposta == 'B') {
				for(int i = 0; i < vetorNota.length; i++) {
					System.out.print("Digite a nota ");
					vetorNota[i] = ler.nextDouble();
				}
			}
			
			if(resposta == 'C') {
				System.out.print("Digite o RA que voce procura ");
				int busca = ler.nextInt();
				System.out.println(buscaLinear(vetorRa, vetorNota, busca));
			}
			
			if(resposta == 'D') {
				System.exit(0);
			}
			
		}while(resposta == 'A' || resposta == 'B' || resposta == 'C' || resposta == 'D'); 
		
	}
	
	public static double buscaLinear(int [] vetorRa, double [] vetorNota, int busca) {
		for(int i = 0; i < vetorRa.length; i++) {
			if(vetorRa[i] == busca) {
				return vetorNota[i];
			}
		}
		return -1;
	}

}
