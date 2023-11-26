package ejercicio11;

public class GestionNotas {

	private Alumno a;
	private Alumno notas[];
	
	
	
	public GestionNotas(Alumno a, Alumno[] notas) {
		this.a = a;
		this.notas = notas;
	}

	public void ponerNotas(int [] notas) {
		a.setNotas(notas);
	}
	
	public void verNotas(int [] notas) {
		for (int i = 0; i < notas.length; i++) {
			a.getNotas();
		}
	}
	
	
}
