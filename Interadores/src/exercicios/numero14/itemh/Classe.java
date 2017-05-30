/*
 *  @_@
	_@_
	@_@
 * 
 */

package exercicios.numero14.itemh;

public class Classe {
	public static void main(String[] args) {
		
		char simbolo1 = '@';
		char simbolo2 = '_';
		
		for (int linhas = 1; linhas < 4; linhas++) {
			
			if ( ( linhas == 1) || ( linhas == 3) ){
				System.out.println(simbolo1 +""+ simbolo2 +""+ simbolo1);
				
			} else {
				for ( int colunas = linhas; colunas <= linhas; colunas++ ){
					System.out.println(simbolo2 + "" + simbolo1 + "" + simbolo2);
				}

			}
						
		}

	}

}
