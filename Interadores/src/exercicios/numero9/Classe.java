/*
 * Imprimir uma lista conforme orienta��es abaixo:
	
	a. 10 - 9 - 8 - 7
	
	b. Perguntar para o usu�rio qual o valor inicial da lista, e qual o valor final da
	lista. Imprimir a lista conforme os valores digitados pelo usu�rio (O usu�rio
	deve apenas digitar valores positivos sendo o segundo valor maior que o
	primeiro, o sistema n�o precisa validar esta situa��o).
	
	c. Perguntar para o usu�rio qual o valor a ser somando em cada intera��o do
	for, dos valores de 0 a 100. Imprimir os valores correspondentes com a
	soma.
	
	d. Perguntar para o usu�rio qual o valor m�ximo (valor positivo maior que 0) da
	intera��o do for, come�ando com o valor 0. Imprimir valores
	correspondentes.
	
	e. Perguntar para o usu�rio qual a mensagem que ele deseja imprimir junto
	com os valores, em uma listagem de 0 a 10. Imprimir o valor digitado pelo
	usu�rio junto com cada n�mero impresso no for.
	
	f. Perguntar para o usu�rio um valor e armazenar em uma vari�vel chamada
	umNumero (o usu�rio deve digitar um valor positivo). Perguntar para o
	usu�rio outro valor e armazenar em uma vari�vel chamada outroNumero (o
	usu�rio deve digitar um valor positivo mairo que o primeiro). Imprimir um
	contador de 0 100, n�o exibindo os valores entre os valores umNumero e
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
