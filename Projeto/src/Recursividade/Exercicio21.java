package Recursividade;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// Numero Fatorial
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero");
		int numero = Integer.parseInt(ler.next());
		
		System.out.print("O fatorial do numero é: " + Fatorial(numero));

	}
	
	public static int Fatorial(int numero) {
		if(numero<= 1) return 1;
		else return numero * Fatorial(numero -1);
	}

}
