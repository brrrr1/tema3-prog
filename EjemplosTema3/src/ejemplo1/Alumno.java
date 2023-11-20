package ejemplo1;

public class Alumno {
	
	
	//atributos
	
	private String nombre;
	private int edad;
	private double notaMedia;
	
	
	
	//constructores
	
	//para crear un objeto con valores
	
	public Alumno (String nombre, int edad, double notaMedia) {
		this.nombre=nombre;
		this.edad=edad;
		this.notaMedia=notaMedia;
	}
	
	public Alumno (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public Alumno() {
		
	}
	
	
	
	//métodos
	
	//Primer metodo para imprimir bonito

	public void mostrarDatos(String calle) {
		//cuerpo
		
		System.out.println("Los datos del alumno son;");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota media: "+notaMedia);
		System.out.println("Calle: "+calle);
		
	}

}
