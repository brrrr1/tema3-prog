package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioUnitario;
		int cantidadBilletes;
		int ticketsComprados;
		
		Ticket t = new Ticket();
		Maquina m = new Maquina();
		
		System.out.println("Establecer precio ticket");
		precioUnitario=Leer.datoDouble();
		precioUnitario=m.establecerPrecio(precioUnitario);
		
		System.out.println("Comprar billetes");
		System.out.println("¿Cuántos?");
		cantidadBilletes=Leer.datoInt();
		ticketsComprados=m.comprarBilletes(cantidadBilletes, precioUnitario, ticketsComprados);
		
		
	}

}
