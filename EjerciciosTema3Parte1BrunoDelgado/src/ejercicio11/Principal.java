package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Curso;
		int [] notas;
		int tam;
		
		int suspensos = 0;
		double media=0;
		
		
		
		
		System.out.println("Curso");
		Curso=Leer.dato();
		
		System.out.println("Cuantas asignaturas");
		tam=Leer.datoInt();
		notas = new int [tam];
		Alumno a1 = new Alumno(Curso, notas, suspensos, media);
		System.out.println("Poner notas");
		GestionNotas g1 = new GestionNotas(a1);
		for (int i = 0; i < notas.length; i++) {
			notas[i]=Leer.datoInt();
			g1.ponerNotas(notas);
		}
		
			System.out.println(g1.verNotas(notas));
		
		
		
		//a1 = new Alumno();
	}

}
