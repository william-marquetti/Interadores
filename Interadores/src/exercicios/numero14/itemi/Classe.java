/*
 * 
 
  
  @@@@@@@
@_________@
@_________@
@_________@
@_________@
@@@@@@@
  
  
  
 
 * 
 * 
 */

package exercicios.numero14.itemi;

public class Classe {
	
	public static void main(String[] args) {

		for (int linhas = 1; linhas <= 6; linhas++) {
			
			if ( ( linhas == 1) || ( linhas == 6) ){
				System.out.println("@@@@@@@");
				
			} else {
				
				for ( int colunas = 1; colunas <= 1; colunas++ ){
					System.out.println("@_____@");
				}

			}
						
		}

	}

}
