package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		
		double precioFabrica;
		double precioCoste;
		double porcentajeTransporte;
		boolean fragil;
		double pvp;
		double porcPvp;
		int leerFragil;
		int posicion=0;
		int eleccion;
		Producto p;
		Tienda t;
		Producto lista[];
		
		System.out.println("Cuantos productos");
		tam=Leer.datoInt();
		lista = new Producto [tam];
		
		do {
		
			System.out.println("""
					1 para añadir un producto
					2 para  ver la lista completa
					3 para ver los productos que llevas añadidos
					0 para salir
					""");
			
			eleccion=Leer.datoInt();
			
			switch(eleccion) {
			
			
			case 1:
		
		
		System.out.println("Vamos a añadir un producto");
		
		System.out.println("Diga un precio de fábrica");
		precioFabrica=Leer.datoDouble();
		System.out.println("Porcentaje transporte");
		porcentajeTransporte=Leer.datoDouble();
		
		t = new Tienda(lista);
		precioCoste=t.calcularPrecioCoste(precioFabrica, porcentajeTransporte);
		System.out.println("El precio de coste es: "+precioCoste);
		
		System.out.println("Diga porcentaje para calcular PvP");
		porcPvp=Leer.datoDouble();
		pvp=t.calcularPvp(precioCoste, porcPvp);
		System.out.println("El PvP es: "+pvp);
		
		//Calcular precio de coste

		System.out.println("¿El producto que vas a añadir es frágil? 1 para si, cualquier otra cosa para no.");
		leerFragil=Leer.datoInt();
		fragil=t.comprobarFragil(leerFragil);
		
		p = new Producto(precioFabrica, precioCoste, porcentajeTransporte , fragil, pvp);	
		
		t.add(p, posicion);
		
		posicion++;
		
		
		break;
		
			case 2:
				for (int i = 0; i < lista.length; i++) {
					System.out.println(lista[i]);
				}
			break;
		
			case 0:
				System.out.println("Adiós");
				break;
		}
		
		}while(eleccion!=0);
	}

}
