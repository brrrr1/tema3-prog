package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioUnitario=0;
		int cantidadBilletes;
		int ticketsComprados=0;
		double precioTotal=0;
		double pagado;
		
		Ticket t = new Ticket(precioUnitario);
		Maquina m = new Maquina(precioUnitario, precioTotal);
		
		System.out.println("Establecer precio ticket");
		precioUnitario=Leer.datoDouble();
		precioUnitario=m.establecerPrecio(precioUnitario);

		
		System.out.println("Comprar billetes");
		System.out.println("¿Cuántos?");
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
		
		System.out.println("Imprimiendo ticket...");
		if(pagado<m.calcularCoste(precioUnitario, cantidadBilletes)) {
			System.out.println("No te alcanza");
		}else {
			m.imprimirTicket(precioUnitario, cantidadBilletes, pagado);
		}
		
		System.out.println("Saldo total:");
		m.hacerSaldoTotal();
		

		
	}

}
