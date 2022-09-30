package usuario;

import java.util.Comparator;

public class ComparadorUsuario implements Comparator<Usuario> {
	//se crea una clase nueva para poder usar el implemento de comparador entre un usuario creado
	//y eligiendo con que tipo de atributo se comparara 
	@Override
	public int compare(Usuario usuario1, Usuario usuario2) {
		// TODO Auto-generated method stub
		return usuario1.getApellido().compareTo(usuario2.getApellido());
	}
}
