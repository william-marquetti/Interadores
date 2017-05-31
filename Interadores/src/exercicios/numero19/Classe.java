/*
 * Imprima apenas valores ímpares e múltiplos de 3, de 0 a 100 utilizando while.
 * 
 */
package exercicios.numero19;

public class Classe {
	
	public static void main(String[] args) {
		
		int min = 0;
		int max = 100;
		while ( min  <= max ){
			
			if ( min % 3 == 0){
				System.out.println(min);
			}
			
			min++;
		}
	}

}