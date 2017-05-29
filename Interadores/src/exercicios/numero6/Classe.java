/*
 * 
 * Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 100, somente
	valores múltiplos de 5 ou 10.
 * 
 * 
 */
package exercicios.numero6;

public class Classe {
	
	public static void main(String[] args) {
		
		for ( int aux = 10; aux < 100; aux++ ){
			if ( ( aux % 5 == 0 ) || ( aux % 10 == 0) ){
				System.out.println(aux);
			}
		}
	}

}
