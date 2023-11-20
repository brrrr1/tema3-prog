package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String texto;
		int num;
		
		System.out.println("Diga la frase");
		texto=Leer.dato();
		
		System.out.println("¿Cuántas veces la quieres repetir?");
		num=Leer.datoInt()-1;
		
		Copiado t = new Copiado(texto, num);
		
		System.out.println(t.repetirFrase());
	}

}
