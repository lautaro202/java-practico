
public class Entrenadores {
	public Entrenadores() {}
		private String nombre;
		private double sueldo;
		private int campeonatosGanados;
		
		public void setName(String valor) {
			nombre = valor;
			}
		
		public String getName() {
			String name = "El nombre del entrenador es " + nombre ;
			return name;
		}
		
		public void setSueldo(double valor) {
			sueldo = valor;
			
		}
		public String getSueldo() {
			String salary = "El sueldo es " + sueldo;
			return salary;
		}
		public void setCampeonato(int valor) {
			campeonatosGanados = valor;
		}
		public String getCampeonatos() {
			if (campeonatosGanados < 0) {
				String text = "no va a tener el bono por no ganar campeonatos";
				return text;
			}
			else {
				String text = "Gan? " + campeonatosGanados + " campeonatos";
				return text;
			}
			
		}
		
		public String calcularSueldoACobrar() {
			if(campeonatosGanados > 10) {
				sueldo = sueldo + 50000;
				String text = "su sueldo es de " + sueldo;
				return text;
			}
			else if (campeonatosGanados >= 5 && campeonatosGanados < 10 ) {
				sueldo = sueldo + 30000;
				String text = "su sueldo es de " + sueldo;
				return text;
			}
			else if (campeonatosGanados > 1 && campeonatosGanados <= 4) {
				sueldo = sueldo + 4000;
				String text = "su sueldo es de " + sueldo;
				return text;
			}
			else if (campeonatosGanados < 1 ) {
				String text = "No puede ganar menos de 0 campeonatos, es muy malo";
				return text;
			}
			String text = "Adios";
			return text;
			
		}
		
		
		
}
