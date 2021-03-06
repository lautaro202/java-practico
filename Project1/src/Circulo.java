
public class Circulo {
	public Circulo() {}
		private double radio;
		private String colorRelleno;
		private String colorLinea;
		final double PY = Math.PI;
		
		public void setRadio(double a) {
			radio = a;
		}
		//void porque no se espera un retorno
		public double getRadio() {
			return radio;
		}
		public void setRelleno(String a) {
			colorRelleno = a;
		}
		public String getRelleno() {
			return colorRelleno;
		}
		public void setLinea(String a) {
			colorLinea = a;
		}
		public String getLinea() {
			return colorLinea;
		}
		
		public double calcularArea() {
			return PY * radio;
		}
		public double calcularPerimetro() {
			return 2 * PY * radio;
		}
		
		public String toString() {
			String aux = "El color del circulo es " + colorRelleno + " , el color de su linea es" + colorLinea + "su perimetro es " + this.calcularPerimetro() + " su area es" + this.calcularArea();
			System.out.println(aux);
			return aux;
		}
		
}
