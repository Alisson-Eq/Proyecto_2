package LISTA;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Haciendo una lista ordenada
 * 
 * @author 6002297
 *
 */
class NuevaLista {
	// constante
	private static final String LISTAORDENADA = "lista ordenada";

	public static void main(String[] args) {
		// creacion de una lista
		ArrayList<Integer> num = new ArrayList<Integer>();
		// inicio de la lista
		num.add(10);
		num.add(80);
		num.add(30);
		num.add(70);

		// recorido de la lista

		for (int i = 0; i < num.size(); i++) {

			System.out.println(num.get(i));

		}

		// mensaje de lista ordenada
		System.out.println(LISTAORDENADA);

		// llama de la funcion ordenada
		ordenar(num);

		// recorido de la lista ya ordenada
		for (int i = 0; i < num.size(); i++) {

			System.out.println("" + num.get(i));

		}
	}

		// funcion para ordenar la lista
		public static void ordenar(ArrayList num) {

		Collections.sort(num);

	}

}
