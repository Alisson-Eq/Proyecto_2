package tienda;

public class Catalogo {
	
	
	// atributos creados
	private Empresa empresa;
	private int id;
	private String temporada;
	private int año;
	
	// getters y setters de todos los atributos ,son necesarios para poder
	//acceder y modificar todos los atributos.
	
	// regresa los atributos de empresa 
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	// regresa el id del catalogo
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// regresa la temporada del catalogo
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	// regresa el año del catalogo
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	// constructor de todos los atributos
	public Catalogo(Empresa empresa, int id, String temporada, int año) {
		super();
		this.empresa = empresa;
		this.id = id;
		this.temporada = temporada;
		this.año = año;
	}
	
	
	//El método toString nos permite mostrar la información completa de los atributos:
	public String toString() {
		return "Catalogo [de la empresa " + empresa + ",con id " + id + ", es de la temporada " + temporada + ",y del año : " + año + "]";
	}
	
	public void creacionNuevoCatalogo() {
		
	}
	
	
	public void eliminarCatalogo() {
			
	}
	
	public void buscarTemporada() {
		
	}
}
