package tienda;

public class Empresa {
	
	// atributos creados
	private int id;
	private String nombre;
	
	// regresa el id de la empresa
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	// regresa el nombre de la empresa
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//constructor de todos los atributos
	public Empresa(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	//El método toString nos permite mostrar la información completa de los atributos
	public String toString() {
		return "Empresa [id de la empresa es : " + id + ", con el nombre : " + nombre + "]";
	}


	

}
