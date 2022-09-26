package REPETIDOS;

import java.util.ArrayList;
import java.util.Collections;

class ListaRepetidos {
	/**
	 * Haciendo una lista repetida
	 * 
	 * @author 6002297
	 *
	 */
	private static final String LISTA_ORDENADA = "lista ordenada";

	public static void main(String[] args) {
		// creacion de una lista
		ArrayList<Integer> num = new ArrayList<Integer>();
		// inicio de la lista repetida
		num.add(10);
		num.add(80);
		num.add(30);
		num.add(80);
		num.add(30);

		// recorido de la lista repetida

		for (int i = 0; i < num.size(); i++) {

			System.out.println(num.get(i));

		}

		// mensaje de lista ordenada
		System.out.println(LISTA_ORDENADA);

		// llama de la funcion ordenada
		ordenar(num);
		// recorido de la lista repetida ya ordenada
		for (int i = 0; i < num.size(); i++) {

			System.out.println("" + num.get(i));

		}

	}

	// funcion para ordenar la lista repetidda
	public static void ordenar(ArrayList num) {

		Collections.sort(num);

	}
}
