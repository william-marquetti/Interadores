/*
 * 
 * Utilizando for, imprimir no console um abaixo do outro, valores de -50 a 50, somente
	valores de 40 a 60.
 * 
 * 
 */
package exercicios.numero5;

public class Classe {

	public static void main(String[] args) {

		for (int aux = -50; aux <= 50; aux++) {
			if ( ( aux >= 40 ) && ( aux <= 60 ) ) {
				System.out.println(aux);
			}
		}

	}

}
