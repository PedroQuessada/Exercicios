package Recursividade;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// Comparar se o existe um numero no vetor
		
		double[] vetor = new double[10];
		Scanner ler = new Scanner(System.in);	
		double numero;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero ");
			numero = Double.parseDouble(ler.next());
			vetor[i] = numero;
			
		}
		
		System.out.print("Digite o numero que deseja procurar");
		double procurar = Double.parseDouble(ler.next());
		
		System.out.print("O numero " + procurar + " esta na posicao" + Proc(vetor, procurar, 0));

	}
	
	public static double Proc(double [] vetor, double procurar, int i) {
		if(vetor[i] == procurar) return i;
	    else return Proc(vetor, procurar, i + 1);
	}

}
