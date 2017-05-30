/*
 * 
	 *   ______________
	 
		||||||||||||||||||||||||||||||
		
		##############
		
		********************
		
		______________
		
		||||||||||||||||||||||||||||||
		
		##############
		
		********************
		
		______________
		
		||||||||||||||||||||||||||||||
		
		##############
		
		********************
 */

package exercicios.numero13.itemf;

public class Classe {
	public static void main(String[] args) {

		int qtSimbolo1 = 14;
		char simbolo1 = '_';

		int qtSimbolo2 = 30;
		char simbolo2 = '|';

		int qtSimbolo3 = 14;
		char simbolo3 = '#';

		int qtSimbolo4 = 20;
		char simbolo4 = '*';

		for (int aux1 = 0; aux1 < 4 ; aux1++){
			for (int aux = 1; aux <= qtSimbolo1; aux++) {
				
				System.out.print(simbolo1);
	
			}
	
			System.out.println("\n");
	
			for (int aux = 1; aux <= qtSimbolo2; aux++) {
	
				System.out.print(simbolo2);
	
			}
			
			System.out.println("\n");
			
			for ( int aux = 1; aux <= qtSimbolo3; aux++){
				
				System.out.print(simbolo3);
	
			}
			
			System.out.println("\n");
			
			for ( int aux = 1; aux <= qtSimbolo4; aux++){
				
				System.out.print(simbolo4);
	
			}
			System.out.println("\n");
		}
			
	}
}
