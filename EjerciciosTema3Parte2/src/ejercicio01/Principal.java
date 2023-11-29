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
		double ventaTotal=0;
		double gastoTotal=0;
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
					3 para calcular las posibles ganancias totales
					4 para ver el gasto total de la tienda
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
		ventaTotal=t.hacerVentaTotal(ventaTotal, pvp, precioCoste);
		//System.out.println("Total: "+ventaTotal);
		gastoTotal=t.hacerGastoTotal(gastoTotal, precioFabrica);
		
		
		posicion++;
		
		
		break;
		
			case 2:
				for (int i = 0; i < lista.length; i++) {
					System.out.println(lista[i]);
				}
			break;
			
			case 3:
				t = new Tienda(lista);
				
				t.verVentaTotal(ventaTotal);
				
			break;
			
			case 4:
				pvp = 0;
				t = new Tienda(lista);
				t.verGastoTotal(gastoTotal, pvp);
		
			case 0:
				System.out.println("Adiós");
				break;
		}
		
		}while(eleccion!=0);
	}

}
