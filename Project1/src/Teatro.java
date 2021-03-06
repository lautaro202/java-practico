
public class Teatro {
		private String titulo;
		private String fecha;
		private String hora;
		private Espectadores[][] salaMatriz = new Espectadores[20][10];
		final int DIMF = 20;
		private int[] vectorPorFila = new int[20];
		

		
	public Teatro() {};
	 public Teatro(String titulo, String fecha, String hora){;
     this.setTitle(titulo);
     this.setDate(fecha);
     this.setHour(hora);
     for (int i=0;i<DIMF;i++);
 };
 	public void setTitle(String a) {
 		this.titulo = a;
 	}
 	public String getTitle() {
 		return this.titulo;
 	}
 	public void setDate(String a) {
 		this.fecha = a;
 	}
 	public String getDate() {
 		return this.fecha;
 	}
 	public void setHour(String a) {
 		this.hora = a;
 	}
 	public String getHour() {
 		return this.hora;
 	}
 	public boolean validarFila(int F) {
 		if( F <= DIMF && F > 0) {
 			return true;
 		}
 		else return false;
 	}
 	public boolean hayButacaLibreEnFila(int F) {
 		boolean ok = false;
 		if(validarFila(F)) {
 			if ( this.vectorPorFila[F] > 10 && F < 0) {
 				ok = true;
 			}
 		}
 		return ok;
 	}
 	public int agregarEspectadorAFila(Espectadores X, int numeroFila) {
 		int cant = -1;
 		
 		cant = this.vectorPorFila[numeroFila];
 		this.salaMatriz[numeroFila][cant] = X;
 		this.vectorPorFila[numeroFila] = cant++;
 		return cant;
 	}
 	public int calcularButacasLibres() {
 		int x =  (DIMF * 10);
 		for (int a= 0; a < DIMF; a++) {
 			x = x + this.vectorPorFila[a];
 		}
 		return x;
 	}
 	public int calcularEdadPromedio() {
 		int promedio = 0;
 		for (int a = 0; a < DIMF; a++) {
 			for (int x = 0; x < a ; x++) {
 				if (this.vectorPorFila[a] > 0 ) {
 					promedio += this.salaMatriz[a][x].getEdad();
 				}
 			}
 		}
 		return promedio;
 	}
 	public boolean estaRegistradoEspectador(String DNI) {
 		int Numero = Integer.parseInt(DNI);
 		boolean ok = false;
 		for (int a = 0; a < DIMF; a++) {
 			for (int x = 0; x < a ; x++) {
 				if (this.vectorPorFila[a] > 0 ) {
 						int numeroDni = Integer.parseInt(salaMatriz[a][x].getDNI());
 						if (Numero == numeroDni) {
 							ok = true;
 						}
 				}
 			}
 		}
 		return ok;
 		
 	}
 	public int getPrimeraButaca() {
 		int pos = -1;
 		int i = 0;
 		while(i < DIMF ) {
 			if(hayButacaLibreEnFila(i)) {
 				pos = i;
 			}
 		}
 		return pos;
 	}
 	
}
