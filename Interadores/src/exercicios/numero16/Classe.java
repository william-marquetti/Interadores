/*
 * Pergunte para o usu�rio digitar um valor menor que 10. Imprima o n�mero
	descrescente de 10 at� o valor digitado pelo usu�rio.
 * 
 * 
 */
package exercicios.numero16;

import java.util.Scanner;

public class Classe {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroDigitado;
		
		System.out.println("Digite um numero");
		numeroDigitado = scanner.nextInt();
		
		while ( numeroDigitado >= 10){
			
			System.out.println("Digite um numero");
			numeroDigitado = scanner.nextInt();
		}
		
		scanner.close();
		
		for ( int aux = 10; aux >=  numeroDigitado; aux-- ){
			System.out.println(aux);
		}
	}
}
