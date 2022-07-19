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

		// TEST (borrar)
		Password contra = new Password(35);
		System.out.println(contra.generarPassword());
		System.out.println(contra.esFuerte());
		// TEST (borrar)

		// Indicamos longitud de las Passwd antes del bucle

		// Bucle que crea un objeto por cada posición del array
		for (int i = 0; i < cantidad; i++) {
			// contrasenas[i] = new Password(longitud);
		}

		// Array de booleanos donde decimos si la passwd es fuerte o no

		// Finalmente mostramos la contraseña y si es fuerte o no
		// for(int i = 0; i < pw.length; i++) {
		// System.out.println("Contraseña " + (i + 1) + ": " +
		// contrasenas[i].getContrasena() + " " + fuerte[i]);
	}
}
