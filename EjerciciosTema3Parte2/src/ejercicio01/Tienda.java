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
		return precioFabrica*porcentajeTransporte+precioFabrica;
	}
	
	public double calcularPvp(double precioCoste,double pvp) {
		return precioCoste*pvp+precioCoste;
	}
	
}


