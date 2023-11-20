package crud;

import java.util.Arrays;

import modelo.Producto;


public class CrudProducto {
	
	private Producto [] lista;
	
	/*
	 * Contstructor para crear un objeto de esta clase pasando como parametro una lista que ya puede tener tamaño dado por el usuario en el main
	 */
	
	public CrudProducto(Producto [] lista) {
		this.lista=lista;
	}

	
	//getters y setters 
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	
	
	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
	/*
	 * Pasamos un producto y una posición y se añade dicho producto en dicha posición. Ojo, porque no se comprueba nada, se pierde lo que había
	 */
	
	public void agregar(Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	
	/*
	 * Método para encontrar productos por su código.
	 */
	
	public Producto findByCodigo(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		//creamos un bucle para que busque mientras la lista no haya terminado ni hayamos encontrado el producto que buscamos
		while (i < lista.length && !encontrado) {
			//creamos un objeto producto
			Producto deLista = lista[i];
			//si el codigo del producto en la posicion en la que estamos es igual al introducido por teclado, entonces encontrado = true para que pare de buscar
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			//sino, avanzamos una posición y repetimos el proceso
			else i++;
		}
		if (encontrado)
			return lista[i]; //Devolvemos el producto buscado
		else
			return null;
					
		}
	//Devuelve el producto
	
	public int findByCodigoV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		//creamos un bucle para que busque mientras la lista no haya terminado ni hayamos encontrado el producto que buscamos
		while (i < lista.length && !encontrado) {
			//creamos un objeto producto
			Producto deLista = lista[i];
			//si el codigo del producto en la posicion en la que estamos es igual al introducido por teclado, entonces encontrado = true para que pare de buscar
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			//sino, avanzamos una posición y repetimos el proceso
			else i++;
		}
		if (encontrado)
			return i; //Devolvemos la posición del producto
		else
			return -1;
					
		}
	
	public void editarPrecio(String codigo, double precioNuevo) {
		int indice = findByCodigoV2(codigo);
		if (indice >= 0) {
			lista[indice].setPrecioUnitario(precioNuevo);
		}
	}
	
	/*public void delete (Producto p) {
		int indice = findByCodigo(p)
				if (indice >= 0) {
					lista[indice].setActivo(false);
				}
	}*/
	

	public void imprimirTodosLosProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	public void imprimirSoloActivos() {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].isActivo()) {
			System.out.println((i+1)+". "+lista[i]);
			}
		}
	}



	
	
	
	
	

}
