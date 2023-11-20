package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int eleccion;
		int quiniela;
		int primitiva;
		int desde;
		int hasta;
		int num;
		boolean resultado;
		Generadora q = new Generadora();
		
		
		
		
		do {

			
			System.out.println("""
					
					1 para Quiniela
					2 para Primitiva
					3 para Pares o Nones
					0 para Salir
					""");
			
			eleccion=Leer.datoInt();
			switch(eleccion) {
			
			case 1:
				
			desde=1;
			hasta=3;
		
			num=q.GenerarQuiniela(desde, hasta);
			q.mostrarQuiniela(num);
		
			break;
			case 2:
				desde = 1;
				hasta = 49;
				primitiva = 6;
				
				for (int i = 0; i < primitiva; i++) {
					System.out.println(q.generarPrimitiva(desde, hasta));
				}
			break;
			
			case 3:
				desde=0;
				hasta=10;
				resultado=q.generarParImpar(desde, hasta);
				q.imprimirParImpar(resultado);
			}
			
		}while(eleccion!=0);
		
	}

}
