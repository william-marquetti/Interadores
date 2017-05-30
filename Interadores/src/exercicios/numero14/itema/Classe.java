/*
 * 
 * Imprimir as imagens abaixo com algoritmos utilizando dois for. Pode ser utilizado if

se necessário.
		
		a. -> 1
		
		1
		
		2
		
		3
		
		-> 2
		
		1
		
		2
		
		3
		
		-> 3
		
		1
		
		2
		
		3
 * 
 * 
 * 
 */
package exercicios.numero14.itema;

public class Classe {
	
	public static void main(String[] args) {
		
		for ( int aux = 1; aux <= 3; aux++ ){
			
			System.out.println( "->" + aux);
			
			for ( int aux2 = 1; aux2 <= 3; aux2++ ){
				System.out.println(aux2);
				
			}
			
		}
		
	}

}
