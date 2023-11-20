package ejercicio04;

public class Cilindro {
	/*Realizar un programa que calcule el volumen de un cilindro. Vosotros debéis decidir qué método usar y
qué valores pasarle. Se debe tener la clase Cilindro.*/
	
	private double radio;
	private double altura;
	
	
	public Cilindro(double radio, double altura) {
		super();
		this.radio = radio;
		this.altura = altura;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodo
	
	public double calcularVolumen () {
		int dos=2;
		double volumen;
		volumen=Math.PI*Math.pow(radio, dos)*altura;
		return volumen;
	}


	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + ", altura=" + altura + "]";
	}
	
	
	
	

}
