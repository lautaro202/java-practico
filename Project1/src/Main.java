import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int[][] matrizEnteros = new int[10][10];
		matrizEnteros[0][0] = 1;
		int suma = 0;
		int suma2= 0;
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				matrizEnteros[i][a] = a;
			}	
		}
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				matrizEnteros[i][a] = a;
				System.out.println("elemento por cada fila " + i + " " + matrizEnteros[i][a]);
			}	
		}
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				if( matrizEnteros[i][a] < 9 && matrizEnteros[i][a] > 2 ) {
					suma += matrizEnteros[i][a];
				}
			}	
		}
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				if(matrizEnteros[i][a] < 3 && matrizEnteros[i][a] > 0 )
				suma2 += matrizEnteros[i][a];
			}	
		}
		System.out.println("la suma de las columnas es de " + suma2);
		System.out.println("la suma total dentro de los elementos de entre las filas 2 y 9 es de " + suma);
	}

}
