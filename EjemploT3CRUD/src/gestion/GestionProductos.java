package gestion;

import modelo.Producto;

public class GestionProductos {
	
	private Producto p;

	public GestionProductos(Producto p) {
		this.p = p;
	}
	
	public double calcularLinea (int cantidad) {
		double subTotal = 0;
		subTotal=cantidad*p.getPrecioUnitario();
		return subTotal;
	}
	
	//Aquí se hace un descuento a partir de que te lleves cierta cantidad de productos
	public double calcularConDescuento (double descuento, int cantidad, int tope) {
		double cien=100;
		if(cantidad>=tope) {
			return calcularLinea(cantidad)-(calcularLinea(cantidad)*(descuento/cien));
		}else {
			return calcularLinea(cantidad);
		}
	}
	

}
