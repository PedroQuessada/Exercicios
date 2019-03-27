package BuscaLinear;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio33 {

	public static void main(String[] args) {
		// LE UMA FRASE E RETORNA A POSICAO ONDE O CARACTER ESTA 
		
		char busca = JOptionPane.showInputDialog(null, "Digite a letra que deseja busca: ").charAt(0);
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
		char vetor [] = new char [15];
		
		while(frase.length() > 16 && frase.length() < 14) {
			frase = JOptionPane.showInputDialog(null, "A frase não possui 15 caracteres\nDigite uma frase: ");
		}
		
		for(int i = 0; i< frase.length(); i++) {
			vetor[i] = frase.charAt(i);
			//System.out.println(frase.charAt(i));
		}	
		
		int h = Exercicio33(vetor, busca);
		
		if( h == -1) {
			System.out.println("A letra não foi encontrado");
		}
		else{
			System.out.println("A letra " +  busca + " foi encontrado na posição: " + h);
		}
		System.exit(0);
	}

	public static int Exercicio33(char [] vetor, int busca) {
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == busca) {
				return i;
			}
		}
		return -1;
	}
	
}

