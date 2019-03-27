package Recursividade;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero ");
		int numeroUm = Integer.parseInt(ler.next());
		
		System.out.print("Digite outro numero ");
		int numeroDois = Integer.parseInt(ler.next());
		
		System.out.print("A multiplicacao entre os dois numero é " + soma(numeroUm, numeroDois, 0));
		
	}
	
	public static int soma(int numeroUm, int numeroDois, int contador) {
		if(numeroDois == contador) return 0;
		else return numeroUm + soma(numeroUm, numeroDois, contador + 1);
		
		
	}

}
