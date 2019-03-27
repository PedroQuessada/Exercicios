package Recursividade;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// Fazer Fibonacci
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero ");
		int numero = Integer.parseInt(ler.next());
		
		System.out.print("A sequencia Fibonacci do numero é: " + Fibonacci(numero));

	}
	
	public static int Fibonacci(int numero) {
		if(numero == 0) return 0;
		else if(numero == 1) return 1;
		else return Fibonacci(numero - 1) + Fibonacci(numero -2);
	}

}
