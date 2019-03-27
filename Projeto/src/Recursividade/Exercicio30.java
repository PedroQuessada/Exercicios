package Recursividade;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero ");
		int numero = Integer.parseInt(ler.next());
		
		System.out.print("O resultado é " + funcao(numero, 0));
	}

	public static double elevar(double numeroUm, double numeroDois, int contador) {
		if(contador == numeroDois) return 1;
		else return numeroUm * elevar(numeroUm, numeroDois, contador + 1);
	}
	
	public static double funcao(int numero, int contador) {
		if(numero == contador) return 0;
		else return elevar(0.5, numero, 0);
		
	}
	
}
