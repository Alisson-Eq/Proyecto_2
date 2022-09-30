package usuario;

import java.util.Comparator;

public class ComparApellido implements Comparator<Usuario1> {
	
	public int compare(Usuario1 usuario_a, Usuario1 usuario_b) {

		return usuario_a.getApellido().compareTo(usuario_b.getApellido());
	}
}
