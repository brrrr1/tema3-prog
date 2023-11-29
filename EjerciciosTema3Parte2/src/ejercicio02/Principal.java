package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    String tipo;
		double precioBase=80;
		double precioPorDias;
		double precioPorTipo;
		double precioConServicios;
		int leerOcupada;
		int leerLimpia;
		int serviciosExtra;
		String nombreCliente;
		String precioServicio;
		int diasContratados;
		boolean limpia;
		boolean ocupada;
		boolean compOcupadas;
		int tam;
		int eleccion;
		int posicion=0;
		String nombreServicio;
		

		Habitacion hab;
		Hotel h;
		Habitacion lista[];
		
		System.out.println("¿Cuántas habitaciones tiene el hotel?");
		tam = Leer.datoInt();
		lista = new Habitacion [tam];
		
		do {
			
			System.out.println("""
					1 para añadir una habitación
					2 para ver todas las habitaciones
					3 para brrrr
					
					""");
			
			eleccion=Leer.datoInt();
			switch(eleccion) {
			
			case 1:
				h = new Hotel(lista);
				System.out.println("Nombre del cliente");
				nombreCliente=Leer.dato();
				
				System.out.println("""
						"Tipos de habitación:
						
						Simple 80€
						
						Doble 60€
						
						VIP 160€
						
						Suite 300€
						
						""");
				tipo=Leer.dato();
				precioPorTipo=h.hacerPrecioPorTipo(precioBase, tipo);
				
				System.out.println("¿Cuantos días?");
				diasContratados=Leer.datoInt();
				precioPorDias=h.hacerPrecioPorDias(precioPorTipo, diasContratados);
				
				System.out.println("""
						Ofrecemos estos servicios extra:
						1 para minibar (+20€)
						2 para desayuno (+15€)
						3 para ambas (OFERTA 30€)
						0 para ninguno
						""");
						serviciosExtra=Leer.datoInt();
						precioConServicios=h.hacerPrecioPorServicio(precioPorDias, serviciosExtra);
						nombreServicio=" ";
						nombreServicio=h.establecerNombreServicio(nombreServicio, serviciosExtra);
						precioServicio=" ";
						precioServicio=h.establecerPrecioServicio(precioServicio, serviciosExtra);
						
				System.out.println("¿Está limpia? 1 para si 0 para no");
				leerLimpia=Leer.datoInt();
				limpia=h.establecerLimpio(leerLimpia);
				
				System.out.println("¿Está ocupada? 1 para si 0 para no");
				leerOcupada=Leer.datoInt();
				ocupada=h.establecerOcupado(leerOcupada);
				
				hab = new Habitacion (tipo, precioBase, serviciosExtra, nombreCliente, diasContratados, limpia, ocupada);
				
				h.add(hab, posicion);
				posicion++;
				
				break;
				
			case 2:
				for (int i = 0; i < lista.length; i++) {
					System.out.println(lista[i]);
				}
				
			break;
			
			case 3:
				System.out.println("brrrr");
			break;
				
			
			}
		}while(eleccion!=0);
		

	}

}
