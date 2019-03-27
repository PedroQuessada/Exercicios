package Recursividade;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String [] args) {
		//impar ou par com recursividade
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero:   ");
		int numero = Integer.parseInt(ler.next());
		
		
		if(Par(numero) == 0) {
			System.out.print("o numero é par" );
		}
		if(Par(numero) == -1) {
			System.out.print("o numero é impar");
		}
				
	}
	
	public static int Par(int numero) {
		if(numero == 0 ) return 0;
		else return Impar(numero - 1);
	}
	
	public static int Impar(int numero) {
		if(numero == 0) return -1;
		else return Par(numero - 1);
	}
	
}
