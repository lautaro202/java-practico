import java.util.Scanner;


public class FuncionCazaFantasmas {

	public static void main(String[] args) {
		Teatro teatro = new Teatro();
		Scanner scanner = new Scanner(System.in);
		Espectadores espectador = new Espectadores();
		System.out.println(teatro.toString());
		teatro.setTitle("CazaFantasmas");
		teatro.setHour("20:00");
		teatro.setDate("22-10-2018");
		String DNI = "0";
		while (DNI.equals("0") && teatro.calcularButacasLibres() > 0) {
			System.out.println("ingrese su nombre");
			String name = scanner.nextLine();
			espectador.setNombre(name);
			System.out.println("ingrese su edad");
			int age = scanner.nextInt();
			espectador.setEdad(age);
			scanner.nextLine();
			System.out.println("ingrese su numero de fila que desee");
			int fila = scanner.nextInt();
			scanner.nextLine();
			boolean checkFila = teatro.validarFila(fila);
			boolean check = teatro.hayButacaLibreEnFila(fila);
			if(checkFila) {
				System.out.println("La fila est? disponible");
			}
			System.out.println(check);
			if(check) {
				teatro.agregarEspectadorAFila(espectador, fila);
				System.out.println("Se ha registrado a la fila " + fila);
			}
			else if (check = false){
				System.out.println("la butaca no se enncuentra disponible, la fila mas cercana disponible es"
						+ teatro.getPrimeraButaca()
					);
				}
				
			System.out.println("ingrese su dni");
			DNI = scanner.nextLine();
			espectador.setDNI(DNI);
			
		}
		

	}

}
