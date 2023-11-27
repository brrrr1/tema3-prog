package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		int lista[];
		double precioFabrica;
		double precioCoste;
		double porcentajeTransporte;
		boolean fragil;
		double pvp;
		Producto p;
		Tienda t;
		
		
		System.out.println("Cuantos productos");
		tam=Leer.datoInt();
		lista = new int [tam];
		
		System.out.println("Diga un precio de fábrica");
		precioFabrica=Leer.datoDouble();
		System.out.println("Porcentaje transporte");
		porcentajeTransporte=Leer.datoDouble();
		

		//Calcular precio de coste

		
	}

}
