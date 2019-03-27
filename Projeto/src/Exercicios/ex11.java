package Exercicios;
import java.lang.Math;
import java.util.Scanner;

public class ex11 {
	
	static class equacao{
	     
	    public static String resultado (int a, int b, int c) {
	    	
	    	double delta = (b * b) - (4 * a * c); 
	    	if(delta < 0) {
	    		String erro = "Delta menor que 0";
	    		return erro;
	    	}
	    	else {
	    		double resultadoUm = ((-b) + (Math.sqrt(delta))) / a;
	    		double resultadoDois = ((-b) - (Math.sqrt(delta))) / a;
	    		
	    		String resultados = "Os resultados sao: " + resultadoUm + "\nE: " + resultadoDois;
	    		
	    		return resultados;
	    	}
	    	
	        
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int a = Integer.parseInt(ler.next());
		
		System.out.print("Digite o segundo numero: ");
		int b = Integer.parseInt(ler.next());
		
		System.out.print("Digite o terceiro numero: ");
		int c = Integer.parseInt(ler.next());
		
		System.out.println(equacao.resultado(a, b, c));
		
	}

}
