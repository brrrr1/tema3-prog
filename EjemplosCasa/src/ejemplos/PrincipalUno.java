package ejemplos;

import utilidades.Leer;

public class PrincipalUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pisoelegido;
		int pisoactual=0;
		int salir;
		Ascensor a = new Ascensor();
		
		System.out.println("Acabas de entrar al ascensor");
		
		do {
		System.out.println("¿Quieres salir? 1 para NO (volver a cambiar de piso) 0 para SI");
		salir=Leer.datoInt();
		
		switch (salir) {
		
		case 1:
		
		
			System.out.println("Estás en el piso "+pisoactual+" ¿A qué piso quieres ir?");
			
			pisoelegido=Leer.datoInt();
			
			a.ir(pisoelegido);
		
		break;
		
		case 0:
			System.out.println("Adiós");
		break;
		default:
			System.out.println("Opción incorrecta");
		}
		
		}while(salir!=0);
	
		
				
				
	}

}
