/*
 * 
 * 
 * 
 @@@@@@@@@@@@
@_____#_____@
@_____#_____@
@###########@
@_____#_____@
@_____#_____@
@@@@@@@@@@@@
 * 
 * 
 */

package exercicios.numero14.iteml;

public class Classe {

	public static void main(String[] args) {

		for (int linhas = 0; linhas <= 6; linhas++) {
			
			if ( ( linhas == 0) || ( linhas == 6) ){
				System.out.println("@@@@@@@@@@@@");
				
			} else if ( ( linhas == 3 ) ) {
				System.out.println("@###########@");
			}else {
				
				for ( int colunas = 1; colunas <= 1; colunas++ ){
					System.out.println("@_____#_____@");
				}

			}
						
		}

	}

}	
