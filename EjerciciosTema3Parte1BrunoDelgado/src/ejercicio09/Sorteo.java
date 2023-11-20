package ejercicio09;

import java.util.Random;

import utilidades.Leer;

/*
 * Crear un programa que gestione un sorteo de lotería. La lotería de Navidad se realiza sobre números que
van desde el 00001 al 99999 (no tendremos en cuenta series). Para facilitar, tendremos solo la clase Sorteo
y la principal para probar todo. El programa debe hacer lo siguiente:
• Comprar un décimo (eligiendo el número por teclado).
• Comprar un décimo generado por la máquina (aleatorio).
• Hacer sorteo (generará aleatoriamente el número premiado).
• Comprobar si nuestro décimo está premiado devolviendo un boolean.
• Mostrar si eres ganador o no.
 */

public class Sorteo {

	private int loteria;



	public Sorteo(int loteria) {
		super();
		this.loteria = loteria;
	}

	
	
	public int generarDecimoAleatorio (int decimo) {
		
		Random rnd = new Random(System.nanoTime());
		int desde=00001;
		int hasta=99999;
		decimo=rnd.nextInt(hasta-desde+1)+desde;
		return decimo;
		
	}
	
	public int elegirDecimo (int decimo) {
		decimo=Leer.datoInt();
		if(decimo<=99999) {
			decimo=decimo;
		}else {
			comunicarProblema();
		}
		return decimo;
	}
	
	public int hacerSorteo () {
		Random rnd = new Random(System.nanoTime());
		int desde=00001;
		int hasta=99999;
		loteria=rnd.nextInt(hasta-desde+1)+desde;
		return loteria;
	}
	
	public void verDecimo(int decimo) {
		System.out.println(decimo);
	}
	
	public void comunicarProblema() {
		System.out.println("No se puede un número tan largo");
	}
	
	public void comprobarSorteo(int decimo) {
		if (decimo==loteria){
			System.out.println("¡¡ENHORABUENA, HAS GANADO");
		}else {
			System.out.printf("Tu número es el "+decimo+" y el premiado es el "+generarDecimoAleatorio(decimo)+". Has perdido\n");
		}
	}



	public int getLoteria() {
		return loteria;
	}



	public void setLoteria(int loteria) {
		this.loteria = loteria;
	}
	
	
	

}


