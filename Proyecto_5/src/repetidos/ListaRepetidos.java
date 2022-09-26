package repetidos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Haciendo una lista ordenada
 * 
 * @author 6002297
 *
 */
public class ListaRepetidos {
	// constante
	private static final String LISTAORDENADA = "lista ordenada";

	public static void main(String[] args) {

		// creacion de una lista
		ArrayList<Integer> num = new ArrayList<Integer>();
		// inicio de la lista repetida
		num.add(30);
		num.add(80);
		num.add(10);
		num.add(80);
		num.add(30);

		// recorido de la lista repetida

		for (int i = 0; i < num.size(); i++) {

			System.out.println(num.get(i));

		}

		// mensaje de lista ordenada
		System.out.println(LISTAORDENADA);

		// llama de la funcion ordenada
		ordenar(num);

	}

	// funcion para ordenar la lista
	public static void ordenar(ArrayList num) {
		
		// Utilizamos la clase HashSet,
		// una de las implementaciones de la interface Set,
		// que define una colección que no puede contener elementos duplicados.
		Set<Integer> hashSet = new HashSet<Integer>(num);
		num.clear();
		num.addAll(hashSet);
		Collections.sort(num);

		// recorido de la lista ya ordenada
		// forEach del ArrayList y le pasa una función que será llamada por cada
		// elemento.
		num.forEach((numeros) -> {
			System.out.println(numeros);
		});

	}

}
