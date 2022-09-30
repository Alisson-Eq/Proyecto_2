package usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsuarioOrdenado {
	//constante 1
	private static final String RAUL = "Raul";
	//constante 2
	private static final String PEREZ = "Perez";
	//constante 3
	private static final String NANCY = " Nancy";
	//constante 4
	private static final String MAMANI = "Mamani";
	//constante 5
	private static final String LEONARDO = " Leonardo";
	//constante 6
	private static final String LOPEZ = "Lopez";
	//constante 7
	private static final String MERY = "Mery";
	//constante 8
	private static final String QUISPE = "Quispe";

	public static void main(String[] args) {
		
		// creacion de una lista
		ArrayList<Usuario> nombre = new ArrayList<Usuario>();
		// inicio de la lista
		nombre.add(new Usuario(QUISPE, MERY));
		nombre.add(new Usuario(LOPEZ, LEONARDO));
		nombre.add(new Usuario(MAMANI, NANCY));
		nombre.add(new Usuario(PEREZ, RAUL));

		// recorido de la lista ya ordenada
		listaOrdenada(nombre);

	}
	
	//funcion para ordenar la lista e imprimir la lista
	public static void listaOrdenada(ArrayList nombre) {
		//usamos sort y compare para ordenar la lista de usuarios
		Collections.sort(nombre, new ComparadorUsuario());
		
		//imprime toda la lista
		for (int i = 0; i < nombre.size(); i++) {

			System.out.println(nombre.get(i));

		}
	}

}