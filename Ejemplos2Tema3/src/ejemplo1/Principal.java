package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nombre;
		double notaProg;
		double notaBBDD;
		double media=0.0;

		Alumno a1;
		
		System.out.println("Diga el nombre:");
		nombre=Leer.dato();
		System.out.println("Nota programación");
		notaProg=Leer.datoDouble();
		System.out.println("Nota BBDD");
		notaBBDD=Leer.datoDouble();
		
		a1 = new Alumno (nombre, notaProg, notaBBDD);
		
		media=a1.hacerMedia();
		a1.mostrarMedia(media);
		
		//o
		
		System.out.println(a1.hacerMedia());
		
		System.out.println();
		
		System.out.println(a1);
		
		
	}

}
