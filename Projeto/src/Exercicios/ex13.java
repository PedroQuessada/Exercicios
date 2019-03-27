package Exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class ex13 {
	
	static class programa{
		
		public static double media(int vetor[]) {
			int media = 0;
			int aux = 0;
			for(int i = 0; vetor[i] < 10; i++) {
				aux = aux + vetor[i];
				media = aux / 10;
			}
			
			return media;
		}
		
		public static double maior(int vetor[]) {
			int maior = 0;
			
			for(int i = 0; i < 10; i++) {
				if(i == 0) {
					maior = vetor[i];
				}
				
				if(vetor[i] > maior) {
					maior = vetor[i];
				}
			}
			
			return maior;
		}
		
		public static double menor(int vetor[]) {
			int menor = 0;
			
			for(int i = 0; i < 10; i++) {
				if(i == 0) {
					menor = vetor[i];
				}
				
				if(vetor[i] < menor) {
					menor = vetor[i];
				}
			}
			
			return menor;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o " + i + " numero: ");
			int a = Integer.parseInt(ler.next());
			vetor[i] = a;
		} 
		
		System.out.println("A media é: " + programa.media(vetor));
		System.out.println("O maior é: " + programa.maior(vetor));
		System.out.println("O menor é: " + programa.menor(vetor));
		
	}
}

