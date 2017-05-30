/*
 * 
 * 13. Imprimir uma lista semelhante as listas abaixo:
 * d. 1

		2
		
		aqui é um terço da lista
		
		4
		
		5
		
		aqui é um terço da lista
		
		7
		
		8
		
		aqui é um terço da lista
 * 
 */

package exercicios.numero13.iteme;

public class Classe {
	public static void main(String[] args) {
		
		int min = 1;
		int max = 9;

		String mensagem = "aqui é um terço da lista";
		
		for ( int aux = min; aux <= max; aux++){
			if ( ( aux % 3 == 0 ) ){
				System.out.println(mensagem);
			}else {
				System.out.println(aux);
			}
		}


	}
}
