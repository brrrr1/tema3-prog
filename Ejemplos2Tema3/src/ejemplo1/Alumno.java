package ejemplo1;


public class Alumno {
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaProg=" + notaProg + ", notaBBDD=" + notaBBDD + "]";
	}

	private String nombre;
	private double notaProg;
	private double notaBBDD;
	
	
	public Alumno(String nombre, double notaProg, double notaBBDD) {
		this.nombre=nombre;
		this.notaProg=notaProg;
		this.notaBBDD=notaBBDD;
		
	}
		
		
		
		
	public double hacerMedia () {
		double suma,media;
		double dos=2;
		suma=notaProg+notaBBDD;
		media=(suma)/dos;	
		return media;
	}
	
	public void mostrarMedia (double media) {
		System.out.println("La nota media de "+nombre+" es "+media);
	}
}



