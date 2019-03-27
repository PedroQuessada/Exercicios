package Recursividade;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero ");
		int numeroUm = Integer.parseInt(ler.next());
		
		System.out.print("Digite outro numero ");
		int numeroDois = Integer.parseInt(ler.next());
		
		System.out.print("A subtracão entre os dois numero é " + sub(numeroUm, numeroDois, 0));
		
	}
	
	public static int sub(int numeroUm, int numeroDois, int contador) {
		if(numeroUm < numeroDois) {
			if(numeroUm + contador == numeroDois) return contador;
			else return sub(numeroUm, numeroDois, contador + 1);
		} 
		if(numeroUm > numeroDois) {
			if(numeroDois + contador == numeroUm) return contador;
			else return sub(numeroUm, numeroDois, contador + 1);
		}
		else return 0;		
	}

}
