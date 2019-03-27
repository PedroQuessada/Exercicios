package Insersao;

public class Algortmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vetor = new int [10];
		int x, j;
		
		for(int i = 1; i < vetor.length; i++) {
			x = vetor[i];
			j = i - 1;
			while( j >= 0 && vetor[j] > x) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = x;
		}
		
	}

}
