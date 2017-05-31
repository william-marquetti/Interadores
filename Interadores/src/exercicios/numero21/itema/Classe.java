/*
 * 21. Reescreva as seguintes questões trocando o for pelo while
	a. 14. a.


->1

1

2

3

-> 2

1

2

3

-> 3

1

2

3
	
 */
package exercicios.numero21.itema;

public class Classe {
	
	public static void main(String[] args) {
		
		int numero = 1;
		int numero2 = 1;
		
		while ( numero <= 3 ){
			
			if ( (numero == 1) || ( numero == 2 ) || ( numero == 3 ) ){
				System.out.println("->"+numero);
				numero++;
				
				while ( numero2 <= 3) {
					System.out.println(numero2);
					numero2++;
					
				}
				
				numero2 = 1;
				
			}
		}
	}

}
