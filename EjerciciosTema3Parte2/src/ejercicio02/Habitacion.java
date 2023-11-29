package ejercicio02;
/*
 * Atributos:
 * Tipo(doble, individual, suite...) (String)
 * Precio base (tipo de habitación, temporada)
 * Servicios extra (minibar, desayuno incluido, limpieza, wifi, spa)
 * Nombre del cliente
 * Numero de dias 
 * Si está limpia o no (boolean)
 * Si está ocupada (boolean)
 */

public class Habitacion {

	private String tipo;
	private double precioBase;
	private int serviciosExtra;
	private String nombreCliente;
	private int diasContratados;
	private boolean limpia;
	private boolean ocupada;
	
	public Habitacion(String tipo, double precioBase, int serviciosExtra, String nombreCliente, int diasContratados,
			boolean limpia, boolean ocupada) {

		this.tipo = tipo;
		this.precioBase = precioBase;
		this.serviciosExtra = serviciosExtra;
		this.nombreCliente = nombreCliente;
		this.diasContratados = diasContratados;
		this.limpia = limpia;
		this.ocupada = ocupada;
		
		
		
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getServiciosExtra() {
		return serviciosExtra;
	}

	public void setServiciosExtra(int serviciosExtra) {
		this.serviciosExtra = serviciosExtra;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasContratados() {
		return diasContratados;
	}

	public void setDiasContratados(int diasContratados) {
		this.diasContratados = diasContratados;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precioBase=" + precioBase + ", serviciosExtra=" + serviciosExtra
				+ ", nombreCliente=" + nombreCliente + ", diasContratados=" + diasContratados + ", limpia=" + limpia
				+ ", ocupada=" + ocupada + "]";
	}
	
	
}