package ejercicio10;

public class Ticket {
	
	private double precioUnitario;

	public Ticket(double precioUnitario) {
		super();
		this.precioUnitario = precioUnitario;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Ticket [precioUnitario=" + precioUnitario + "]";
	}
	
}
