package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio;
		double altura;
		double volumen;
		
		System.out.println("Diga radio");
		radio=Leer.datoDouble();
		
		System.out.println("Diga altura");
		altura=Leer.datoDouble();
		
		Cilindro c = new Cilindro(radio,altura);
		
		System.out.printf("El volumen de este cilindro es %.2f",c.calcularVolumen());
		

	}

}
