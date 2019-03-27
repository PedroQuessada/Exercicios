package Exercicios;
import java.util.Scanner;

public class ex12 {

	static class primo{
		public static boolean resultado(int a) {
			if(a % 2 != 0 ||a % 3 != 0 ||a % 5 != 0 ||a % 7 != 0) {
				return false;
			}
			else {
				return true;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int a = Integer.parseInt(ler.next());
		
		if(primo.resultado(a) == true) {
			System.out.println("O numero é primo");
		}
		else {
			System.out.println("O numero não é primo");
		}
	}

}
