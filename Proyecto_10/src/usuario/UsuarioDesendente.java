package usuario;

import java.util.ArrayList;
import java.util.Collections;

public class UsuarioDesendente {
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
				ArrayList<Usuario1> nombre = new ArrayList<Usuario1>();
				// inicio de la lista
				nombre.add(new Usuario1(QUISPE, MERY));
				nombre.add(new Usuario1(LOPEZ, LEONARDO));
				nombre.add(new Usuario1(MAMANI, NANCY));
				nombre.add(new Usuario1(PEREZ, RAUL));

				// recorido de la lista desendente
				listaDesendente(nombre);
	
	}
	
	//funcion para ordenar la lista e imprimir la lista
		public static void listaDesendente(ArrayList nombre) {
			//usamos sort y compare para ordenar y reverseOrder para desender la lista de usuarios
			Collections.sort(nombre, Collections.reverseOrder( new ComparApellido()));
			
			//imprime toda la lista
			for (int i = 0; i < nombre.size(); i++) {

				System.out.println(nombre.get(i));

			}
		}

}
