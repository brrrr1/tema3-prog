package arraysdeobjetos;

import utilidades.Leer;

public class Concesionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nVs=0, seguir, tam=100;
		//Contador de objetos Vehículo, variable para salir del
		//bucle y tamaño
		String modelo;
		double potencia;
		//Creamos un array de objetos Vehiculo para almacenar 100 Vehículos
		Vehiculo lista[] = new Vehiculo[tam];
		String aux;
		Conc c;
		c = new Conc(lista, nVs);
		int tope =150;
		
		do {
			System.out.print("Introduce el modelo del vehículo: ");
			modelo = Leer.dato();
			System.out.print("Introduce la potencia: ");
			potencia=Leer.datoDouble();
			lista[nVs]=new Vehiculo (modelo, potencia);
			nVs++;//Aumentamos en uno el número de vehículos
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			seguir=Leer.datoInt();
		} while(seguir !=0 && nVs<lista.length);

		//Imprimimos los vehículos introducidos, ojo no hasta el 
		//tamaño del array, sino hasta donde hay vehículos con datos
		
		for (int i=0; i<nVs; i++){
			System.out.println (lista[i]);
		}
			System.out.println("Fin del programa");
			
			
		
		
		System.out.println("Tope");
		tope=Leer.datoInt();
		c.mostrarEmpepinados(tope);
		
		System.out.println(c.getLista()[1].getPotencia());
			
		
	}

}
