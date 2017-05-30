/*
 * 
 * 13. Imprimir uma lista semelhante as listas abaixo:
 * d. 1

		2
		
		aqui é o meio da lista
		
		aqui é o meio da lista
		
		5
		6
 * 
 */

package exercicios.numero13.itemd;

public class Classe {
	public static void main(String[] args) {
		
		int min = 1;
		int max = 6;
		int meio1 = ( max / 2 );
		int meio2 = meio1+1; 		
		
		for ( int aux = min; aux <= max; aux++){
			if ( (aux == meio1) || (aux == meio2)){
				System.out.println("Aqui é o meio da lista");
			}else {
				System.out.println(aux);
			}
		}


	}
}
