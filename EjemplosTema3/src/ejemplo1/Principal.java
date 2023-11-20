package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String nombre;
		int edad;
		double notaMedia;
		Alumno a1;
		//instanciamos un objeto con valores
		System.out.println("Diga el nombre");
		nombre=Leer.dato();
		System.out.println("Diga la edad");
		edad=Leer.datoInt();
		System.out.println("Diga la nota media");
		notaMedia=Leer.datoDouble();
		
		a1 = new Alumno(nombre, edad, notaMedia);
		
		a1.mostrarDatos("Asunción");

	}

}
