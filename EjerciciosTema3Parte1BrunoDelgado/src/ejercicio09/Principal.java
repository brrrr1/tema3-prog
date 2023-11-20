package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int loteria = 0;
		int decimo=0;
		int eleccion;
		int eleccion2;
		Sorteo s = new Sorteo(loteria);
		
		System.out.println("Bienvenido");
		do {
			System.out.println("""
					1 para comprar un décimo
					2 para sortear la lotería
					3 para comprobar si has ganado
					0 para salir
					""");
			eleccion=Leer.datoInt();
			switch (eleccion) {
			case 1:
				System.out.println("""
						1 para elegir el número
						2 para generarlo aleatoriamente
						""");

				eleccion2=Leer.datoInt();
				switch (eleccion2) {
				case 1:
					System.out.println("Introduce tu número");
					decimo=s.elegirDecimo(decimo);
					
				break;
				case 2:
					decimo=s.generarDecimoAleatorio(decimo);
					System.out.println("El número asignado es: "+s.generarDecimoAleatorio(decimo));
				}
			break;
			case 3:
				s.comprobarSorteo(decimo);
			break;
			
			case 0:
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Introduce un número correcto");
			
			}
		}while(eleccion!=0);
		
	}

}
