/*
 * Imprimir uma lista conforme orientações abaixo:
	
	a. 10 - 9 - 8 - 7
	
	b. Perguntar para o usuário qual o valor inicial da lista, e qual o valor final da
	lista. Imprimir a lista conforme os valores digitados pelo usuário (O usuário
	deve apenas digitar valores positivos sendo o segundo valor maior que o
	primeiro, o sistema não precisa validar esta situação).
	
	c. Perguntar para o usuário qual o valor a ser somando em cada interação do
	for, dos valores de 0 a 100. Imprimir os valores correspondentes com a
	soma.
	
	d. Perguntar para o usuário qual o valor máximo (valor positivo maior que 0) da
	interação do for, começando com o valor 0. Imprimir valores
	correspondentes.
	
	e. Perguntar para o usuário qual a mensagem que ele deseja imprimir junto
	com os valores, em uma listagem de 0 a 10. Imprimir o valor digitado pelo
	usuário junto com cada número impresso no for.
	
	f. Perguntar para o usuário um valor e armazenar em uma variável chamada
	umNumero (o usuário deve digitar um valor positivo). Perguntar para o
	usuário outro valor e armazenar em uma variável chamada outroNumero (o
	usuário deve digitar um valor positivo mairo que o primeiro). Imprimir um
	contador de 0 100, não exibindo os valores entre os valores umNumero e
	outroNumero.
	
 */

package exercicios.numero9;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {

		// Item a
		System.out.println("Item A:\n---------------------");
		for (int aux = 10; aux >= 7; aux--) {

			if (aux == 7) {
				System.out.print(aux);
			} else {
				System.out.print(aux + " - ");
			}
		}

		System.out.println("\n");
		
		// Item b		
		System.out.println("Item B:\n---------------------");
		System.out.println();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero inicial");
		int numeroInicial = Integer.parseInt(scanner.nextLine());

		System.out.println("Digite o numero final");
		int numeroFinal = Integer.parseInt(scanner.nextLine());

		for (int aux = numeroInicial; aux <= numeroFinal; aux++) {
			
			if (aux == numeroFinal) {
				System.out.print(aux);
			} else {
				System.out.print(aux + " - ");
			}
		}
		
		System.out.println("\n");
		
		// Item C
		System.out.println("Item C:\n---------------------");
		System.out.println();
		
			
		int soma = 0;
		
		System.out.println("Digite o numero a ser somado");
		int numeroSoma = Integer.parseInt(scanner.nextLine());


		for (int aux = 0; aux <= 100; aux++) {
			
			soma = soma + numeroSoma;
			
			if (aux == 100) {
				System.out.print(soma);
			} else {
				System.out.print(soma + " - ");
			}
		}
		
		
		System.out.println("\n");
		
		// Item C
		System.out.println("Item D:\n---------------------");
		System.out.println();

	}
}
