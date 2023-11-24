package ejemploUsoArrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int desde, hasta, tam, truco;
		
		Listas listado = new Listas();
		int [] lista;
		
		
		
		System.out.println("Diga tamaño");
		tam=Leer.datoInt();
		
		lista = new int[tam];
		
		System.out.println("Desde");
		desde=Leer.datoInt();
		System.out.println("Hasta");
		hasta=Leer.datoInt();
		
		listado.rellenarArray(hasta, desde, lista);
		
		
		System.out.println("¿Qué nota quieres?");
		truco=Leer.datoInt();
		listado.imprimirArray(lista);
		System.out.println();
		listado.imprimirArray(listado.trucarLista(lista, truco));
		
		
	}

}
