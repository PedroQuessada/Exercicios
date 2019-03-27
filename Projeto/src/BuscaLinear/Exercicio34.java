package BuscaLinear;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char busca = JOptionPane.showInputDialog(null, "Digite a letra que deseja busca: ").charAt(0);
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
		char vetor [] = new char [15];
		
		if(frase.length() > 15) {
			JOptionPane.showMessageDialog(null, "A frase não possui 15 caracteres\nDigite uma frase: ");
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
