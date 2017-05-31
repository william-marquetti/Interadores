/*
 * Diga para o usuário escrever uma palavra, e enquanto a palavra conter as seguintes
	letras (a, e, i, o, u) imprima a seguinte frase, você imprimiu uma palavra com vogal.
	Caso o usuário digite uma palavra sem vogal, imprima a frase “Você imprimiu uma
	palavra sem vogal”, e encerre o programa.
  
 * 
 */
package exercicios.numero23;

import java.util.Scanner;

public class Classe {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean temVogal = false;
		
		String palavra = "";
		
		
		while ( temVogal != true){
			
			System.out.println("Digite uma palavra");
			palavra = scanner.nextLine();
			
			if ( 
					palavra.contains("a") ||
					palavra.contains("e") ||
					palavra.contains("i") ||
					palavra.contains("o") ||
					palavra.contains("u") 
					
				){
				System.out.println(" você imprimiu uma palavra com vogal");
				temVogal = false;
			}else{
				System.out.println("Você imprimiu uma palavra sem vogal");
				temVogal = true;
			}
			
			
		}
			
	}
	

}
