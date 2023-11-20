package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		String aula;
		String fecha;
		
		Cabecera c;
		
		System.out.println("Diga nombre");
		nombre=Leer.dato();
		System.out.println("Diga aula");
		aula=Leer.dato();
		System.out.println("Diga fecha");
		fecha=Leer.dato();
		
		c= new Cabecera(nombre, aula, fecha);
		
		System.out.println(c);
	}

}
