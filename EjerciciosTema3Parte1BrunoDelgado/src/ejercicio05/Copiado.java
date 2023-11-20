package ejercicio05;
/*Cuando era pequeño me mandaban a copiar determinadas frases cuando hacía algo mal para no olvidarlo.
Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla dicho texto
una cantidad de veces igual al número introducido*/
public class Copiado {
	
	private String texto;
	private  int num;
	
	
	public Copiado(String texto, int num) {
		super();
		this.texto = texto;
		this.num = num;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	
	//metodo
	public String repetirFrase () {
		for (int i = 0; i < num; i++) {
			System.out.println(texto);
		}
		return texto;
	}


	@Override
	public String toString() {
		return "Copiado [texto=" + texto + ", num=" + num + "]";
	}
	
	

}
