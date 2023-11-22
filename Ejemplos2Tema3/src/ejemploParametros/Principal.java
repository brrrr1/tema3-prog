package ejemploParametros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		
		System.out.print("Valores de x e y antes de la modificación: ");
		System.out.println(" x = " + x + "; y = " + y);
		
		modifyPrimitiveTypes(x, y);
		
		System.out.print("Valores de x e y después de la modificación: ");
		System.out.println(" x = " + x + "; y = " + y);
		
		}
		
	//Este método es estático y lo tenemos en el main porque 
	//no es necesario ni tiene mucho sentido crear
	//una clase para él. No hay ningún objeto al que atribuirle este método
	
	
	
	/*
	 * Aquí se ven las dos veces x=1 e y=2 porque las modificaciones solo
	 * existen dentro del método. Para ver los valores modificados habría que 
	 * imprimir el método 
	 */
	private static void modifyPrimitiveTypes(int x, int y) {
		
		x = 5;	
		y = 10;
		//System.out.println(x);
		//System.out.println(y);

		}
		

	
}
