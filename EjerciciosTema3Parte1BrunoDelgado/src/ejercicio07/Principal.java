package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int eleccion;
		int resultado;
		boolean ganador;
		CaraOCruz p = new CaraOCruz();
		
		System.out.println("¿Cara (1) o Cruz (2)?");
		eleccion=Leer.datoInt();
		
		
		resultado=p.simularLanzamiento();
		p.mostrarGanador(eleccion, resultado);
	}

}
