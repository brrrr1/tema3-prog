package ejercicio01;

public class Cabecera {
	
	private String nombre;
	private String aula;
	private String fecha;
	
	public Cabecera (String nombre, String aula, String fecha) {
		this.nombre=nombre;
		this.aula=aula;
		this.fecha=fecha;
	}
	
	

	@Override
	public String toString() {
		return "Cabecera [nombre=" + nombre + ", aula=" + aula + ", fecha=" + fecha + "]";
	}
	


}
