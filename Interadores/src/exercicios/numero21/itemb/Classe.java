/*
 * 21. Reescreva as seguintes questões trocando o for pelo while
	14. i.
	
  
@@@@@@@
@_____@
@_____@
@_____@
@_____@
@@@@@@@
  
*/
package exercicios.numero21.itemb;

public class Classe {

	public static void main(String[] args) {

		int linhas = 1;
		int colunas = 1;

		while (linhas < 6) {
			if ((linhas == 1) || (linhas == 5)) {
				System.out.println("@@@@@@@");

			} else {

				System.out.println("@_____@");
			}
			
			linhas++;
		}
		

	}

}
