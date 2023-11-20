package principal;

import modelo.Producto;
import crud.CrudProducto;
import gestion.GestionProductos;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro variables
		
		String nombre, codigo;
		double precio;
		boolean activo;
		double precioNuevo;
		Producto [] listado;
		int tam=10;
		CrudProducto cp1;
		int op;
		int cantidad;
		int descuento;
		int tope;
		
		
		Producto pipasreyes = new Producto("1a", "Pipas Reyes", 0.50, true);
		Producto aguabicho = new Producto("2a", "Agua Ursu9 1,5L",0.78, true);
		GestionProductos gp = new GestionProductos(listado[op]);
		
		
		//instancio el array
		listado= new Producto [tam];
		//instancio el objeto de la clase cru pasando un array de productos
		cp1 = new CrudProducto(listado);
		
		System.out.println("Vamos a añadir un producto");
		System.out.println();
		System.out.println("Diga nombre");
		nombre=Leer.dato();
		System.out.println("Diga precio");
		precio=Leer.datoDouble();
		
		Producto producto3 = new Producto("3a", nombre, precio, true);
		
		//agregar productos
		cp1.agregar(pipasreyes, 0);
		cp1.agregar(aguabicho, 1);
		cp1.agregar(producto3, 2);
		
		
		
		
		System.out.println("Lista completa:");
		cp1.imprimirTodosLosProductos();
		
		System.out.println("Solo en venta:");
		cp1.imprimirSoloActivos();

		
		//System.out.println("Vamos a borrar uno");
		//cp1.delete
		
	
		
		
		
		/*System.out.println("Vamos a editar el precio de un producto");
		System.out.println("Introduce el codigo");
		codigo=Leer.dato();
		System.out.println("Introduce el nuevo precio");
		precioNuevo=Leer.datoDouble();*/

		
		
		//linea de producto
		System.out.println("Cuantos productos llevas");
		cantidad=Leer.datoInt();
		System.out.println("Cuantos para descuento");
		tope=Leer.datoInt();
		System.out.println("Cuanto descuento");
		descuento=Leer.datoInt();
		cp1.imprimirSoloActivos();
		System.out.println("A cual");
		op=Leer.datoInt();
		gp.calcularConDescuento(descuento, cantidad, tope);
	}

}
