package ejercicio07;

import java.util.Random;

import utilidades.Leer;

/*Crear un programa que simule el juego de cara o cruz. Para ello, se usarán los siguientes métodos:
• Método que simule el lanzamiento de la moneda y resultado.
• Método para comprobar ganador, se le pasará el número elegido por el jugador y dentro se generará
el aleatorio llamando al método anterior. Devuelve true si son iguales o false si no.
• Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de ganador y
si no, debe mostrar "Siga jugando".
• En el main, se debe crear lo necesario para simular un juego de cara o cruz.*/

public class CaraOCruz {
	
	public int simularLanzamiento() {
		int resultado;
		
		int desde=1, hasta=2;
		Random rnd=new Random(System.nanoTime());
		resultado=rnd.nextInt(hasta-desde+1)+desde;
		
		return resultado; 
	}
	
	public boolean comprobarGanador(int eleccion, int resultado) {
		

		boolean ganador;
		
		if (resultado==eleccion) {
			ganador=true;
		}else {
			ganador=false;
		}
		
		return ganador;
	}
	
	public void mostrarGanador (int eleccion, int resultado) {
		boolean ganador;
		ganador=comprobarGanador(eleccion, resultado);
		if (ganador==true) {
			System.out.println("¡¡Has ganado!!");
		}else {
			System.out.println("Has perdido ;(");
		}
	}

}
