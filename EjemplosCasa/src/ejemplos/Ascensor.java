package ejemplos;

	public class Ascensor {
		private boolean puertaAbierta;
		private int pisoActual;
		private int PISOMAX;
		private int PISOMIN;
		public void subir (){
			System.out.println("Subiendo una planta");
			pisoActual ++;
			System.out.println("Piso: "+ pisoActual);
		}
		public void bajar (){
			System.out.println("Bajando una planta");
			pisoActual --;
			System.out.println("Piso: "+ pisoActual);
		}
		public void ir (int pisoElegido){
			while (pisoActual !=pisoElegido){
				if (pisoActual <pisoElegido){
					subir ();
				}else {
					bajar ();
				}
			}
		}
}

