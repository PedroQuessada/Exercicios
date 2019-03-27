package BuscaLinear;
import java.util.Scanner;
public class Exercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		double [] vetor = new double[10];
		
		for(int i = 0; i <vetor.length; i++) {
			System.out.print("Digite um numero ");
			vetor[i] = ler.nextDouble();
		}
		
		System.out.print("Digite o numero que voce busca ");
		double busca = ler.nextDouble();
		
		System.out.print("O numero digitado esta na posicao " + maior(vetor,busca));
		
	}
	
	public static int maior(double [] vetor, double busca) {
		int maior = -1;
		//compara cada posicao do vetor com o numero buscado
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == busca) {
				//se o indice que encontrou o numero for maior que o indice anterior ele guarda o valor do indice em maior
				if(i > maior) {
					maior = i;
				}
			}	
		}
		return maior;
	}

}
