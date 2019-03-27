package Recursividade;

import java.util.Scanner;

public class Exercicio26A {

	public static void main(String[] args) {
		// Calculando MDC
		
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero:   ");
		int numeroUm = Integer.parseInt(ler.next());
		
		System.out.print("Digite outro numero:   ");
		int numeroDois = Integer.parseInt(ler.next());
		
		System.out.print("O maximo divisor é: " + mdc(numeroUm, numeroDois));

	}

	public static int mdc(int a, int b) {
		if(b == 0) return a; 
		else return mdc(b, a % b);
	}
	
	
}
