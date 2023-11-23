package ejercicio10;

public class Maquina {
	private double precioUnitario;
	private double precioTotal;
	 //Ticket t = new Ticket(precioUnitario);
	 





	 
	

	public Maquina(double precioUnitario, double precioTotal) {

		this.precioUnitario = precioUnitario;
		this.precioTotal = precioTotal;
	}
	
	public double establecerPrecio(double precioUnitario) {
		 
		return precioUnitario;
	}

	public int comprarBilletes(int cantidadBilletes, double precioUnitario, int ticketsComprados) {
		 
		 return ticketsComprados;
	 }
	 
	 public double calcularCoste(double precioUnitario, int cantidadBilletes) {
		 precioTotal=precioTotal+precioUnitario*cantidadBilletes;
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
			System.out.println("Pagado: ");
			System.out.print(pagado);
			System.out.println("\nCambio: ");
			System.out.print(hacerCambio(pagado, precioUnitario, cantidadBilletes));
			System.out.println("-----------------------");
			System.out.println("Mensaje válido para "+cantidadBilletes+" personas");
			System.out.println("\n*************************************************************");
	 }
	 
	 
	 public void hacerSaldoTotal() {
			System.out.println(precioTotal);
		}
	 
	 public boolean comprobarContrasena(String contrasena, String leerContrasena) {
		 
		 if(leerContrasena==contrasena) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	 public int verComprob(String contrasena, String leerContrasena) {
		 if (comprobarContrasena(contrasena, leerContrasena)==true) {
			 int c = 1;
			 return c;
		 }else {
			 int c = 2;
			 return c;
		 }
		 
	 }
}
