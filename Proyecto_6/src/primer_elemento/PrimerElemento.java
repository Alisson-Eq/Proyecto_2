package primer_elemento;

import java.util.ArrayList;
/**
 * Buscando el primer elemento
 * 
 * @author 6002297
 *
 */
class PrimerElemento {
    //constante1
	private static final String ENCUENTRA_EL_PRIMER_NUMERO = "encuentra el primer numero";
	//constante2
	private static final String LISTA_REPETIDA = "lista repetida";
	//constante3
	private static final String mensaje = null;

	public static void main(String[] args) {
		
		// creacion de una lista
		ArrayList<Integer> num = new ArrayList<Integer>();
		// inicio de la lista repetida
		num.add(30);
		num.add(80);
		num.add(10);
		num.add(80);
		num.add(30);
		num.add(40);
		num.add(20);
		num.add(10);
		num.add(40);
		num.add(10);
		
		//llama al recorido de la lista original
		lista(num, mensaje);
		
		// llama al elemento y la posicion de dicho elemento
		primero(num, mensaje);

	}
	//funcion de mostrar la lista en pantalla
	public static void lista(ArrayList num, String mensaje) {
		System.out.println(LISTA_REPETIDA);
		for (int i = 0; i < num.size(); i++) {

			System.out.println(num.get(i));

		}
	}
	//funcion de buscar el un numero en este caso el primero de la lista
	public static void primero(ArrayList num, String mensaje) {
		//iniciomos buscando un numero
		int busca = 30;
		
		//El método .indexOf() recibe como parámetro el elemento que queremos buscar en la lista
		int posicion = num.indexOf(busca);
		
		//mensaje para diferenciar el resultado
		System.out.println(ENCUENTRA_EL_PRIMER_NUMERO);
		
		//hacemos el recorido de dicha lista para saber si el elemento se encuentra en dicha lista y a la vez en que posicion se encuentra 
		if (posicion >= 0)
			System.out.println("El elemento " + busca + " está en la lista. En la posición " + posicion);
		else
			System.out.println("El elemento " + busca + " NO está en la lista");
	}

}