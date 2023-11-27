package arraysdeobjetos;

public class Conc {

	private Vehiculo [] lista;
	private int nVs;

	
	
	public Conc(Vehiculo[] lista, int nVs) {
		super();
		this.lista = lista;
		this.nVs = nVs;
	}



	public void mostrarEmpepinados(int topePotencia) {
		
			for (int i=0; i<nVs; i++){
				if (lista[i].getPotencia()>=topePotencia) {
				System.out.println (lista[i].getModelo());
			}
			}
		 
	}



	public Vehiculo[] getLista() {
		return lista;
	}



	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}



	public int getnVs() {
		return nVs;
	}



	public void setnVs(int nVs) {
		this.nVs = nVs;
	}
}
