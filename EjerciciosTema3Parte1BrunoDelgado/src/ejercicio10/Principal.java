package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contrasena = "1234";
		String leerContrasena;
		double precioUnitario=0;
		int cantidadBilletes = 0;
		int ticketsComprados=0;
		double precioTotal=0;
		double pagado = 0;
		int eleccion;
		
		Ticket t = new Ticket(precioUnitario);
		Maquina m = new Maquina(precioUnitario, precioTotal);
		
		
		System.out.println("Bienvenido, introduce la contraseña para entrar al sistema");
		System.out.print("Contraseña: ");
		leerContrasena=Leer.dato();
		if(m.verComprob(contrasena, leerContrasena)==1) {
			System.out.println("Bienvenido...");
			System.out.println();
			do {
				System.out.println("""
						1 para establecer el precio de los billetes
						2 para compra de billete/s
						3 para imprimir el ticket
						4 para ver saldo total
						0 para salir
						""");
				eleccion=Leer.datoInt();
				switch(eleccion) {
				case 1:
					System.out.println("Introduzca precio para el ticket");
					precioUnitario=Leer.datoDouble();
					precioUnitario=m.establecerPrecio(precioUnitario);
					

					break;
				
				case 2:
					System.out.println("¿Cuántos billetes?");
					cantidadBilletes=Leer.datoInt();
					ticketsComprados=m.comprarBilletes(cantidadBilletes, precioUnitario, ticketsComprados);
					System.out.println("El precio es ");
					m.verCoste(precioUnitario, cantidadBilletes);
					
					System.out.println("¿Ccon cuánto han pagado?");
					pagado=Leer.datoDouble();
					 
					if(pagado<m.calcularCoste(precioUnitario, cantidadBilletes)) {
						System.out.println("No te alcanza");
					}else {
						System.out.println("Tu cambio es de:");
						System.out.println(m.hacerCambio(pagado, precioUnitario, cantidadBilletes));
					}
					break;
					
				case 3:
					System.out.println("Imprimiendo ticket...");
					if(pagado<m.calcularCoste(precioUnitario, cantidadBilletes)) {
						System.out.println("No te alcanza");
					}else {
						m.imprimirTicket(precioUnitario, cantidadBilletes, pagado);
					}
				break;
				
				case 4:
					System.out.println("Saldo total:");
					m.hacerSaldoTotal();
				break;
				
				case 0:
					System.out.println("Adiós");
				break;
				default:
					System.out.println("Introduce una opción válida");
				}
			}while(eleccion!=0);
		}else {
			System.out.println("Contraseña incorrecta");
		}
		
		


		
	
		
		
		
		
		
		
		
		
		
		

		
	}

}
