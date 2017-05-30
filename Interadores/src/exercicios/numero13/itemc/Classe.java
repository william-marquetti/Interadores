/*
 * 
 * 13. Imprimir uma lista semelhante as listas abaixo:
 * c. 1

		2
		
		aqui é o meio da lista
		
		4
		
		5
 * 
 */

package exercicios.numero13.itemc;

public class Classe {
	public static void main(String[] args) {
		
		int min = 1;
		int max = 15;
		int diferenca = (max - min);
		int meio = (diferenca / 2)+1;
			
		for ( int aux = min; aux <= max; aux++){
			if (aux == meio){
				System.out.println("Aqui é o meio da lista");
			}else {
				System.out.println(aux);
			}
		}


	}
}
