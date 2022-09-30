package tienda;

public class Producto {
	
	// atributos creados
	private Empresa empresa;
	private int id;
	private String marca;
	private String color;
	private int talla;
	private double precio;
	
	//getters y setters de todos los atributos
	
	// regresa los atributos de empresa 
		public Empresa getEmpresa() {
			return empresa;
		}
		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}
	// regresa la id del producto
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// regresa la marca del producto
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// regresa el color del producto
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// regresa la talla del producto
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	
	// regresa el precio del producto
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//constructor de todos los atributos
	public Producto(Empresa empresa, int id, String marca, String color, int talla, double precio) {
		super();
		this.empresa = empresa;
		this.id = id;
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}
	
	//El método toString nos permite mostrar la información completa de un objeto, es decir, el valor de sus atributos.
	public String toString() {
		return "Producto [de la empresa " + empresa + ",con  id " + id + ", marca " + marca + ", color " + color + ", y talla "
				+ talla + ",tiene un precio de : " + precio + "]";
	}	
	public void creacionProducto() {
		
	}
	
	
	public void eliminarProducto() {
			
	}
	
	public void buscarProducto() {
		
	}
	
	public void actualizarProducto() {
		
	}
}
