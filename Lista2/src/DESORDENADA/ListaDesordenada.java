package DESORDENADA;

import java.util.ArrayList;
import java.util.Collections;

class ListaDesordenada {
	//constante
		private static final String LISTA_DESORDENADA = "lista desordenada";

		public static void main(String[] args) {
			//creacion de una lista
			ArrayList<Integer> num = new ArrayList<Integer>();
			//inicio de la lista
			num.add(10);
			num.add(80);
			num.add(30);
			num.add(70);

			//recorido de la lista

			for (int i = 0; i < num.size(); i++) {

				System.out.println(num.get(i));

			}
			
			//mensaje de lista desordenada
			System.out.println(LISTA_DESORDENADA);
			
			//llama de la funcion desordenada
			desordenar(num);
			
			//recorido de la lista ya desordenada		
			for (int i = 0; i < num.size(); i++) {

				System.out.println("" + num.get(i));

			}
		}

			// funcion para desordenar la lista
			public static void desordenar(ArrayList num) {
			
			Collections.sort(num,Collections.reverseOrder());
			
			}

}
