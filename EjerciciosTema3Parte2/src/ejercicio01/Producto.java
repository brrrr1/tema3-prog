package ejercicio01;


/*
 * Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica). En esta
clase se debe tener el método para calcular el precio de coste, que será el precio de fábrica más un porcentaje
pasado como parámetro que será el coste en el transporte.
En una clase Tienda, con un array de productos como atributo se podrá:
- Listar datos de todos los productos.
- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
- Añadir un producto a la lista pasando como parámetro un producto.
- Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los
precios de fábrica.
- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio
de coste.
- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los
precios de venta al público menos la suma de todos los precios de fábrica.
Crear un main de prueba con un menú donde se pueda hacer todo esto.
 */
public class Producto {

	private double precioFabrica;
	private double precioCoste;
	private double porcentajeTransporte;
	private boolean fragil;
	private double pvp;
	
	public Producto(double precioFabrica, double precioCoste, double porcentajeTransporte, boolean fragil, double pvp) {
		this.precioFabrica = precioFabrica;
		this.precioCoste = precioCoste;
		this.porcentajeTransporte = porcentajeTransporte;
		this.fragil = fragil;
		this.pvp = pvp;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public double getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}

	public double getPorcentajeTransporte() {
		return porcentajeTransporte;
	}

	public void setPorcentajeTransporte(double porcentajeTransporte) {
		this.porcentajeTransporte = porcentajeTransporte;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", precioCoste=" + precioCoste + ", porcentajeTransporte="
				+ porcentajeTransporte + ", fragil=" + fragil + ", pvp=" + pvp + "]";
	}
	
	
	
	
}

