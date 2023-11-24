package ejemploUsoArrays;

import java.util.Random;

public class Listas {

	
	public void rellenarArray(int hasta, int desde, int [] lista) {
		
		Random rnd = new Random(System.nanoTime());
		for (int i = 0; i < lista.length; i++) {
			lista[i]=rnd.nextInt(hasta-desde+1)+desde;
		}
		
		
	}
	
	public void imprimirArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
	}
	
	//Podría haber dos versiones, una pasando la lista
	//también como parámetro y otra instanciando la lista
	//dentro del método
	
	public int[] trucarLista(int [] lista, int truco) {
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]=truco;
		}
		return lista;
	}
	
}
