package Exercicios;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char vetor3[] = new char[26];
		int b = 0;
		
		for(char a = 'a'; a <= 'z'; a++) {
			vetor3[b] = a;
			b++;
		}
		
		for(char ab : vetor3) {
			System.out.print(ab + "\n");
		}
		
	}

}
