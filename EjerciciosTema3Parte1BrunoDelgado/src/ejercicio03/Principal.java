package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		Operaciones o = new Operaciones(num);
			
		System.out.println("Diga numero");
		num=Leer.datoInt();
		
		
	
		System.out.println(o.comprobarSigno(num));
		

	}

}
