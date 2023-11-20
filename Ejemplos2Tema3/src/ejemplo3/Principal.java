package ejemplo3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nombre="Acoche";
		double precio;
		double precioNuevo;
		int numeroDeRuedas;
		
		Vehiculo v = new Vehiculo ("Amoto", 1200.00, 2);
		
		Vendedor vd = new Vendedor ("Luis", 1200.00, 2);
		
		System.out.println(v);
		
		System.out.println(nombre);
		
		System.out.println(v.getNombre());
		
		
		//modificar
		System.out.printf("El precio sin modificar es %.2f", v.getPrecio());
		System.out.println("\n");
		
		System.out.println("Diga nuevo precio");
		precioNuevo=Leer.datoDouble();
		v.setPrecio(precioNuevo);
		
		System.out.printf("El nuevo precio es %.2f",v.getPrecio());
		
		System.out.println();
		
		System.out.println(vd);
		
		
	}

}
