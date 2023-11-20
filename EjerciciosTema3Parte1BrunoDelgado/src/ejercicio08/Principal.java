package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreTitular="Brrr";
		double ingresar, retirar, saldo=0;
		double cambio;
		int eleccion;
		
		CuentaCorriente c = new CuentaCorriente(saldo, nombreTitular);
		do {
		System.out.println("""
				\n1 Para ver saldo
				2 para ingresar
				3 para retirar
				4 para ver tu saldo en dolares
				0 para salir
				""");
		eleccion=Leer.datoInt();
		
		switch (eleccion) {
		case 1:
			c.verSaldo();
		break;
		
		case 2:
			System.out.println("Diga la cantidad a ingresar");
			ingresar=Leer.datoDouble();
			c.ingresar(ingresar);
		break;
			
		case 3:
			System.out.println("Diga la cantidad a retirar");
			retirar=Leer.datoDouble();
			if(retirar<c.getSaldo()) {
				c.retirar(retirar);
			}else {
				System.out.println("No tienes tanto dinero");
			}

			break;
			
		case 4:
			System.out.println("¿A cuánto está hoy el dolar?");
			cambio=Leer.datoDouble();
			c.verSaldoDolares(cambio);
			break;
			
		case 0:
			System.out.println("Adiós");
			break;
			default:
				System.out.println("Introduce una opción correcta");
		}
		}while(eleccion!=0);
		
	}

}
