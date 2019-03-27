package Recursividade;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero ");
		int numeroUm = Integer.parseInt(ler.next());
		
		System.out.print("Digite outro numero ");
		int numeroDois = Integer.parseInt(ler.next());
		
		System.out.print("O primeiro numero elavado ao segundo é " + elevar(numeroUm, numeroDois, 0));
		
	}

	public static int elevar(int numeroUm, int numeroDois, int contador) {
		if(contador == numeroDois) return numeroUm;
		else return numeroUm * elevar(numeroUm, numeroDois, contador + 1);
	}
	
	
}
