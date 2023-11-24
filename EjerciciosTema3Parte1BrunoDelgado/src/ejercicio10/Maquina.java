package ejercicio10;

public class Maquina {
	
	private String contrasena;
	private double precioTotal;
	private Ticket t;
	 //Ticket t = new Ticket(precioUnitario);
	 


	public Maquina(String contrasena, double precioTotal, Ticket t) {
		super();
		this.contrasena = contrasena;
		this.precioTotal = precioTotal;
		this.t=t;
	}


	
	public double establecerPrecio(double precioUnitario) {
		 
		return precioUnitario;
	}
	
	public void cambiarPrecioBillete(double precioUnitario) {
		t.setPrecioUnitario(precioUnitario);
	}


	public int comprarBilletes(int cantidadBilletes, double precioUnitario, int ticketsComprados) {
		 
		 return ticketsComprados;
	 }
	 
	 public double calcularCoste(double precioUnitario, int cantidadBilletes) {
		 return precioUnitario*cantidadBilletes;
		 
	 }
	 
	 public void verCoste(double precioUnitario, int cantidadBilletes) {
		 System.out.println(calcularCoste(precioUnitario, cantidadBilletes));
	 }
	 
	 public double hacerCambio(double pagado, double precioUnitario, int cantidadBilletes) {

		 return pagado-calcularCoste(precioUnitario, cantidadBilletes);
	 }
	 
	 public void imprimirTicket(double precioUnitario, int cantidadBilletes, double pagado) {
		 System.out.println("*************************************************************");
			System.out.println("Precio\t\tCantidad\t\tTotal");
			System.out.println(precioUnitario+"\t\t"+cantidadBilletes+"\t\t\t"+calcularCoste(precioUnitario, cantidadBilletes));
			System.out.println("-----------------------");
			System.out.println("Mensaje válido para "+cantidadBilletes+" personas");
			System.out.println("-----------------------");
			System.out.print(hacerCambio(pagado, precioUnitario, cantidadBilletes)+"\n");
			System.out.println("Pagado: ");
			System.out.print(pagado);
			System.out.println("\nCambio: ");
			System.out.println("Mensaje válido para "+cantidadBilletes+" personas");
			System.out.println("\n*************************************************************");
	 }
	 
	 
	 public double hacerSaldoTotal(double precioUnitario, int cantidadBilletes) {
		 	precioTotal += calcularCoste(precioUnitario, cantidadBilletes);
			return precioTotal;
		}
	 
	 public void verSaldoTotal() {
		 System.out.println(precioTotal);
	 }
	 
	 public boolean comprobarContrasena(String leerContrasena) {
		 contrasena="1234";
		 if(leerContrasena.equalsIgnoreCase(contrasena)) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	 public int verComprob(String contrasena, String leerContrasena) {
		 if (comprobarContrasena(leerContrasena)==true) {
			 int c = 1;
			 return c;
		 }else {
			 int c = 2;
			 return c;
		 }
		 
	 }
	 
	 public void saldoA0() {
		 int cero=0;
		 setPrecioTotal(cero);
		 precioTotal=cero;
	 }



	public String getContrasena() {
		return contrasena;
	}



	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}



	public double getPrecioTotal() {
		return precioTotal;
	}



	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}



	public Ticket getT() {
		return t;
	}



	public void setT(Ticket t) {
		this.t = t;
	}
}
