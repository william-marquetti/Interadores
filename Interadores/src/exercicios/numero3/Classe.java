/*
 * 
 * 
 * Utilizando for, imprimir no console um abaixo do outro, valores de -10 a 10, somente
	valores positivos.
 * 
 * 
 */
package exercicios.numero3;

public class Classe {
	
	public static void main(String[] args) {
		
		for ( int aux = -10; aux <= 10; aux++ ){
			if ( aux >= 0 ){
				System.out.println(aux);
			}
		}
		
	}
}
