/*
 * 
 * Imprimir uma lista semelhante a lista abaixo:
		1_10
		2_9
		3_8		
		4_7		
		5_6		
		6_5		
		7_4		
		8_3		
		9_2		
		10_1
 * 
 * 
 */

package exercicios.numero12;

public class Classe {
	
	public static void main(String[] args) {
		
		int inicioLista1 = 1;
		int fimLista1 = 10;
		int inicioLista2 = fimLista1;
		
		for ( int aux = inicioLista1; aux <= fimLista1; aux ++){
			
			System.out.println(aux + "_" + inicioLista2);
			inicioLista2--;

		}
	}

}
