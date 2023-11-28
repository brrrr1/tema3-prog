package ejercicio01;

import java.util.Arrays;



public class Tienda {

	private Producto lista[];

	public Tienda(Producto[] lista) {
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}

	
	public double calcularPrecioCoste(double precioFabrica, double porcentajeTransporte) {
		int cien=100;
		return ((precioFabrica/cien)*porcentajeTransporte)+precioFabrica;
	}
	
	public double calcularPvp(double precioCoste,double pvp) {
		int cien=100;
		return precioCoste+((pvp/cien)*precioCoste);
	}
	
	public boolean comprobarFragil(int leerFragil) {
		if (leerFragil==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	
	
	
}


