package Exercicios;
import java.util.Scanner;

public class ex14 {
	
	static class programa{
		
		public static int proximo(int posicao) {
			int v = posicao + 1;
			return v;
		}
		
		public static int anterior(int v) {
			int posicao = 0;
			v = posicao + 1;
			if(v < 0) {
				return -1;
			} else {
				return v;
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int resp = 0;
		int vetor [] = new int [10];
		
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite o " + i + " numero: ");
			int a = Integer.parseInt(ler.next());
			vetor[i] = a;
		}
		
		do{
			System.out.println("Digite uma opcao: \n 1-) proxima posixao \n 2-) posicao anterior \n 0-) Sair");
			resp = Integer.parseInt(ler.next());
			
			if(resp == 1) {
				int pro = programa.proximo(0);
				System.out.println(vetor[pro]);
			}
			
			if(resp == 2) {
				int ant = programa.anterior(0);
				if(ant == -1) {
					System.out.print("Voce esta na primeira posicao " + vetor[0]);
				} else {
					System.out.println(vetor[ant]);
				}
			}
			
			if(resp == 0) {
				System.exit(0);
			}
			
			

		}while(true);
		
	}
}
