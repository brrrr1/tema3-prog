package ejemplosobrecarga;

public class Operaciones {

	
	public void sumarDosNumeros(double a, double b) {
		System.out.println(a+b);
	}
	
	public void sumarDosNumeros(int a, double b) {
		System.out.println(a+b);
	}
	
	public void sumarDosNumeros(double a, int b) {
		System.out.println(a+b);
	}
	
	public void sumarDosNumeros(int a, int b) {
		System.out.println(a+b);
	}
	
}
