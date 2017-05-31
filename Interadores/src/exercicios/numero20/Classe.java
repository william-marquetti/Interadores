/*
 * Pergunte para o usuário digitar dois valores, some o dois. Imprima o texto “:)”
	conforme o resultado da soma dos dois número. Ou seja, se a soma dos dois
	número resultou em 2, deve ser impresso duas vezes o texto “:)”.
 */
package exercicios.numero20;

import java.util.Scanner;

public class Classe {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro numero");
		int numero2 = scanner.nextInt();
		scanner.close();
		
		int soma = numero1 + numero2;
		
		for ( int aux = 1; aux <= soma; aux++ ){
			System.out.println(":)");
		}
	}

}
