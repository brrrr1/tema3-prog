package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int loteria = 0;
		int decimo=0;
		int eleccion;
		int eleccion2;
		int desde=00001;
		int hasta=99999;
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
					if(decimo<=99999) {
					decimo=Leer.datoInt();
					decimo=s.elegirDecimo(decimo);
					}else {
						System.out.println("No se puede un número tan largo");
					}
					
				break;
				case 2:
					decimo=s.generarDecimoAleatorio();
					System.out.println("El número asignado es: "+s.generarDecimoAleatorio());
				}
			break;
			case 3:
				s.comprobarSorteo(decimo, desde, hasta);
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
