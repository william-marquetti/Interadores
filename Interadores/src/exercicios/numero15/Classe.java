/*
 * Pergunte para o usu�rio digitar um valor. Imprima de zero at� o valor digitado pelo

usu�rio utilizando while.
 * 
 */
package exercicios.numero15;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = scanner.nextInt();
		scanner.close();
		
		int aux = 0;
		while ( aux <= numero ){
			System.out.println(aux);
			aux++;
		}
		
	}
}
