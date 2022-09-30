package usuario;

public class Usuario1 {
	// atributos creados
		private String apellido;
		private String nombre;

		//getters y setters de todos los atributos
		
		// regresa el apellido 
		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		// regresa el nombre 
		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		//constructor de todos los atributos
		public Usuario1(String apellido, String nombre) {
			super();
			this.apellido = apellido;
			this.nombre = nombre;
		}


		//El método toString nos permite mostrar la información completa de un objeto
		@Override
		public String toString() {
			return "" + apellido + " " + nombre;
		}


		
}
