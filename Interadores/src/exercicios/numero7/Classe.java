/*
 * Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 20, somente
	valores m�ltiplos de 5 seguindo o exemplo da mensagem (Este n�mero � m�ltiplo de
	5: &lt;n�mero&gt;) ou m�ltiplos de 10 seguindo o exemplo da mensagem 
	(Este n�mero �	m�ltiplo de 10: &lt;n�mero&gt;). 
	Alterar o &lt;n�mero&gt; para o valor da vari�vel do contador.
 * 
 * 
 */
package exercicios.numero7;

public class Classe {
	
	public static void main(String[] args) {
		
		for ( int aux = 10; aux <= 20; aux++){
			
			if ( aux % 5 == 0 ){
				System.out.println("Este n�mero � multiplo de 5: "+ aux);
			}
			
			if ( aux % 10 == 0 ){
				System.out.println("Este n�mero � multiplo de 10: "+ aux);
			}
			
			
		}
	}

}
