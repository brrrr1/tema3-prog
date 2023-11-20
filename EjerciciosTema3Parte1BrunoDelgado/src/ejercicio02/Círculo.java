package ejercicio02;

public class Círculo {
	//atributo
	private double radio;
	
	//constructor
	public Círculo(double radio) {
		this.radio=radio;
	}
	
	
	//método calcular area
	public double calcularArea () {
		double area;
		double dos=2;
		area=Math.pow(radio, dos)*Math.PI;
		return area;
	}
	
	public double pasarAMCuadrados () {
		double conversion = 10000;
		// mostrarArea(calcularArea());
		// ESTO NO. NO SE IMPRIME EN LOS METODOS
		// PARA CALCULAR XXXXXXX NONONONONONONONO
		return calcularArea()/conversion;	
	}
	

}
