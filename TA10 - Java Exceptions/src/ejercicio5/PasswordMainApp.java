package ejercicio5;

import java.util.Scanner;

public class PasswordMainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Password[] contrasenas;
		int cantidad;

		// Array de contraseñas con tamaño por teclado
		System.out.println("Introduzca la cantidad de contraseñas a generar:");
		cantidad = sc.nextInt();
		contrasenas = new Password[cantidad];

		// Indicamos longitud de las Passwd antes del bucle
		System.out.println("Introduzca la longitud de la contraseña a generar:");
		int longitud = sc.nextInt();
		sc.nextLine();

		// Bucle que crea un objeto por cada posición del array
		for (int i = 0; i < cantidad; i++) {
			contrasenas[i] = new Password(longitud);
		}

		// Array de booleanos donde decimos si la passwd es fuerte o no
		boolean[] fuerte = new boolean[cantidad];
		for(int i = 0; i <  fuerte.length; i++) {
			fuerte[i] = contrasenas[i].esFuerte();
		}

		// Finalmente mostramos la contraseña y si es fuerte o no
		for(int i = 0; i < contrasenas.length; i++) {
			boolean resultado = fuerte[i];
			if(resultado) {
				System.out.println("\nEs fuerte");
			} else {
				System.out.println("\nNo es fuerte");
			}
			System.out.println("Contraseña " + (i + 1) + ": " +
			contrasenas[i].getContrasena() + " " + resultado);
		}
		sc.close();
	}
}
