/*
 * Imprimir uma lista semelhante as listas abaixo:	
		b 9 8 8 7 7 6 6 5 5 4 4 3 3 2 2 1	
 * 
 */
package exercicios.numero13.itemb;

public class Classe {
	
	public static void main(String[] args) {
		
		for ( int aux = 9; aux >= 1; aux-- ){
			
			if ( (aux == 1) || (aux == 9) ){
				System.out.print(aux +" ");
			}else {
				System.out.print(aux +" " + aux +" ");
			}
			
			
		}
	}

}
