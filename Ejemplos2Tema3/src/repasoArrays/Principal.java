package repasoArrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		int tam2;
		int hasta, desde,eleccion, valor, suma=0, dos=2,ceros=0;
		Random rnd = new Random (System.nanoTime());
		//1. Declaración de arrays, varias formas
		//a) Dando valores inicialmente, inicializando
		//Como no damos el taño, el tamaño es directamente el número de elementos que ponemos
		
		int []lista = {2,3,6};//Tamaño?3. Ya se puede usar este array
		
		//b) Declarando e instanciando en direfentes lineas
		
		//Primero se declara, siempre primero
		
		int lista2[];
		
		//necesito el tamaño, lo pido, tengo que declarar una variable al comienzo para guardarlo
		
		System.out.println("Diga el tamaño");
		tam=Leer.datoInt();
		//Instancio con ese tamaño
		
		lista2= new int [tam];//El tamaño es el leído, ya se puede usar
		
		//c) Todo en la misma línea, debemos tener el tamaño antes
		
		System.out.println("Diga el tamaño");
		tam2=Leer.datoInt();
		int[] lista3 = new int [tam2];
		
		//El mejor es el segundo, aunque puede que nos encontremos el primero
		
		//2. Cargar o rellenar array
		//Varias formas
		
		//a) Leyendo por teclado
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]=Leer.datoInt();
		}
		
		
		//b) Aleatorio
		System.out.println("Hasta");
		hasta=Leer.datoInt();
		System.out.println("Desde");
		desde=Leer.datoInt();
		for (int i = 0; i < lista3.length; i++) {

			lista2[i]=rnd.nextInt(hasta-desde+1)+desde;
		}
		
		
		//c) Cascaporra style{
			int lista4[] = {33, 69, 5, 7};
			
		//Mostrar array
			
			for (int i = 0; i < lista4.length; i++) {
				System.out.print("  "+lista4[i]);
			}
		
		//4. Accceso a un elemento
			
			System.out.println("Diga que elemento quiere cambiar");
			eleccion=Leer.datoInt()-1;
			System.out.println("Indique el nuevo valor");
			valor=Leer.datoInt();
			
			lista4[eleccion] = valor;
			
			
		//5. Sumar todos los elementos
			
			for (int i = 0; i < lista4.length; i++) {
				suma += lista4[i];
			}
			
		//Operaciones variadas
			
			//Multiplicar pares por dos
			for (int i = 0; i < lista4.length; i++) {
				if(lista4[i]%2==0) {
					lista4[i]=lista4[i]*dos;
				}
			}
			
			//Contar ceros
			for (int i = 0; i < lista4.length; i++) {
				if(lista4[i]==0) {
					ceros++;
				}
			}
			
			
	}

}
