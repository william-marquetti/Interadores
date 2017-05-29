/*
 * Utilizando for, imprimir no console conforme exemplo abaixo (Utilizar
	System.out.print ao invés do System.out.println):
		a. 0,1,2,3,4,5,6,7,8,9,10		
		b. 10,9,8,7,6,5,4,3,2,1		
		c. 0, 2, 4, 6, 8, 10		
		d. 10, 7, 4, 1		
		e. 0,1,3,6,10,15,21,28 
 * 
 */
package exercicios.numero8.itemd;

public class Classe {
	
	public static void main(String[] args) {
		for (int aux = 10; aux >= 1; aux = aux - 3){
					
			if ( aux == 1 ){
				System.out.print(aux);
			}else {
				System.out.print(aux+",");
			}
		}
	}
}