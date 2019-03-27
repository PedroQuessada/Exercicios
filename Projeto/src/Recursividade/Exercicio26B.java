package Recursividade;

import java.util.Scanner;

public class Exercicio26B {

	public static void main(String[] args) {
		// Descobrir o minimo dividor comum
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero:   ");
		int numeroUm = Integer.parseInt(ler.next());
		
		System.out.print("Digite outro numero:   ");
		int numeroDois = Integer.parseInt(ler.next());
		
		System.out.print("O maximo divisor é: " + descobrir(numeroUm, numeroDois, 2));

	}

	public static int descobrir(int numeroUm, int numeroDois, int divisor) {
		if(numeroUm % divisor == 0 && numeroDois % divisor == 0) {
			return divisor;
		}
		else return descobrir(numeroUm, numeroDois, divisor + 1);
	}
	
}
