import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Entrenadores entrenador = new Entrenadores();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Introduzca el nombre del entrenador");

		entrenador.setName(scanner.nextLine());
		System.out.println(entrenador.getName());
		System.out.println("Introduzca el sueldo del entrenador");

		entrenador.setSueldo(scanner.nextDouble());
		System.out.println(entrenador.getSueldo());
		System.out.println("Introduzca los campeonatos ganados del entrenador");

		entrenador.setCampeonato(scanner.nextInt());
		System.out.println(entrenador.getCampeonatos());
		System.out.println(entrenador.calcularSueldoACobrar());
	}

}
