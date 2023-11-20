package ejemplo3;

public class Vehiculo {
	
	private String nombre;
	private double precio;
	private int numeroDeRuedas;
	
	
	public Vehiculo (String nombre, double precio, int numeroDeRuedas ) {
		this.nombre=nombre;
		this.precio=precio;
		this.numeroDeRuedas=numeroDeRuedas;
	}
	
	//metodos que nos van a ayudar a obtener el valor de un atributo
	
	
	//get y set de nombre
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	//get  y set de precio
	public double getPrecio () {
		return precio;
	}
	
	public void setPrecio (double precio) {
		this.precio=precio;
	}
	
	
	//get y set de numeroDeRuedas
	public int getNumeroDeRuedas () {
		return numeroDeRuedas;
	}
	
	public void setNumeroDeRuedas (int numeroDeRuedas) {
		this.numeroDeRuedas=numeroDeRuedas;
	}

}
