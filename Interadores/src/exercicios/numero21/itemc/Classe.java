/*
 * 
 * 
@@@@@@
@____@
@____@
@####@
@____@
@____@
@@@@@@
 * 
 */

package exercicios.numero21.itemc;

public class Classe {

	public static void main(String[] args) {

		int linhas = 1;
	
		while (linhas <= 7) {
			if ((linhas == 1) || (linhas == 7)) {
				System.out.println("@@@@@@");

			} else if ( (linhas == 4) ) {
				System.out.println("@####@");
				
			} else {

				System.out.println("@____@");
			}
			
			linhas++;
		}

	}

}
