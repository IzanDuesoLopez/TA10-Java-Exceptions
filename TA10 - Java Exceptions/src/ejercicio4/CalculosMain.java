package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculosMain {

	public static void main(String[] args) {
		funcionalidad(); // Llamamos al método con la funcionalidad
	}
	
	public static void funcionalidad() {
		Scanner sc = new Scanner(System.in);
		Calculos calcular = new Calculos();
		
		int opcionMenu = 0;
		System.out.println("Elige la operación que deseas realizar: \n(1) Suma\n(2) Resta\n(3) Multiplicación\n(4) Potencia\n" + 
		"(5) Raíz cuadrada\n(6) Raíz cubica\n(7) División\n>");
		
		// Hacemos un try catch para comprobar que no se introducen valores no validos
		try {
			opcionMenu = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Número no valido " + e.getMessage());
		}
		
		// Switch con la opción elegida por el usuario
		switch (opcionMenu) {
		case 1:
			calcular.suma();
			break;
		case 2:
			calcular.resta();
			break;
		case 3:
			calcular.multiplicacion();
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		default:
			break;
		}
		
	}

}
