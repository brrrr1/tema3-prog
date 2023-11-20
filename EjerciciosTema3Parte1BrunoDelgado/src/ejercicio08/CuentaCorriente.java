package ejercicio08;

/*
 *  Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está caracterizada por
su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de operaciones:
• Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No imprime
de nuevo el saldo, pero sí lo actualiza.
• Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta una
determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el saldo, pero
sí lo actualiza.
• Calcular el saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el
valor del saldo en dólares.
• Consultar el saldo. Solo imprime el saldo.
 */
public class CuentaCorriente {

	private double saldo=0;
	private String nombreTitular;
	
	public CuentaCorriente(double saldo, String nombreTitular) {
		super();
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public void ingresar (double ingresar) {
		saldo=saldo+ingresar;
	}
	
	public double retirar (double retirar) {
		saldo=saldo-retirar;
		return saldo;
	}
	
	public double calcularEnDolares (double cambio) {
		double saldoNuevo;
		saldoNuevo=saldo*cambio;
		return saldoNuevo;
	}
	
	public void verSaldoDolares (double cambio) {
		double saldoNuevo;
		saldoNuevo=calcularEnDolares(cambio);
		System.out.printf("Tu salario en dolares es de %.2f dólares",saldoNuevo);
	}
	
	public void verSaldo() {
		System.out.println(saldo);
	}
	
	 	
	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", nombreTitular=" + nombreTitular + "]";
	}


	
	
	
	
}
