package ejercicio06;
/*Crear una clase llamada Generadora sin atributos, pero con varios métodos que generen aleatoriamente
distintos números o resultados según las características del sorteo o para qué se vaya a usar, por ejemplo,
generar 1, x, 2 para una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para jugar
a los "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben todos
los métodos pidiendo los datos necesarios para cada generación*/

import java.util.Random;

public class Generadora {
	
	public int generarNumero(int desde, int hasta) {
	
		Random rnd=new Random(System.nanoTime()); 
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public int GenerarQuiniela(int desde, int hasta) {
		int num=0;
		num=generarNumero(desde, hasta);
		
		return num;
	}
	
	public void mostrarQuiniela(int num) {
		if (num==1) {
			System.out.println("El resultado para esta quiniela es: 1");
			}
		if (num==2) {
			System.out.println("El resultado para esta quiniela es: X");
			}
		if (num==3) {
			System.out.println("El resultado para esta quiniela es: 2");
			}
	}
	
	public int generarPrimitiva (int desde, int hasta) {
		int num=0;
		
		num=generarNumero(desde, hasta);
		
		return num;
	}
	
	public boolean generarParImpar (int desde, int hasta) {
		int dos=2, num1;
		boolean resultado;
		
		num1=generarNumero(desde, hasta);
		
		if((num1)%dos==0) {
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
	}
	public void imprimirParImpar (boolean resultado) {
		if (resultado==true) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El número es impar");
		}
	}

	

}


