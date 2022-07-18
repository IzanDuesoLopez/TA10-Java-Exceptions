package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculosMain {

	public static void main(String[] args) {
		funcionalidad(); // Llamamos al método con la funcionalidad
	}

	public static void funcionalidad() {
		Scanner sc = new Scanner(System.in); // Declaramos el Scanner
		Calculos calcular = new Calculos(); // Instanciamos el objeto calcular de la clase Calculos

		int opcionMenu = 0; // La opción del menú la inicializamos a 0
		double a = 0.0, b = 0.0; // Variables que pasaremos por parametro a los métodos del objeto calculo
		System.out.println("Elige la operación que deseas realizar: \n(1) Suma\n(2) Resta\n(3) Multiplicación\n(4) Potencia\n"
						+ "(5) Raíz cuadrada\n(6) Raíz cubica\n(7) División\n>"); /* Mostramos por pantalla las
																					 diferentes opciones */

		/* Hacemos un try catch para comprobar que no se introducen valores no validos
		   en la elección del menú */
		try {
			opcionMenu = sc.nextInt();
		} catch (InputMismatchException e) { // Lanzamos la excepción InputMismatchExcepcion en el caso de que no sea un número entero
			System.out.println("Número no valido " + e.getMessage());
		}
		
		// En el caso de que la operación necesite pedir dos números
		if(opcionMenu == 1 || opcionMenu == 2 || opcionMenu == 3 || opcionMenu == 4 || opcionMenu == 7) {
			introducirDosValores(a, b, sc);
		// En el caso de que únicamente necesite pedir un número
		} else if (opcionMenu == 5 || opcionMenu == 6){
			introducirUnValor(a, sc);
		}

		// Switch con la opción elegida por el usuario
		switch (opcionMenu) { /* En cada opción del switch, pediremos al usuario que introduzca los valores
								 correspondientes y finalmente realizaremos el calculo */
		case 1: // En el caso de la suma, introducimos dos valores y los sumamos
			System.out.println(a + " + " + b + " = " + calcular.suma(a,b));
			break;
		case 2: // En el caso de la resta, introducimos dos valores y los restamos
			System.out.println(a + " - " + b + " = " + calcular.resta(a,b));
			break;
		case 3: // En el caso de la multiplicación, introducimos dos valores y los multiplicamos
			System.out.println(a + " * " + b + " = " + calcular.multiplicacion(a,b));
			break;
		case 4: // En el caso de la potencia, introducimos dos valores. El segundo de ellos será el exponente
			System.out.println(a + "^" + b + " = " + calcular.potencia(a, (int) b));
			break;
		case 5: // En el caso de la raíz cuadrada, introducimos un valor y realizamos el calculo
			System.out.println("sqrt(" + a + ")" + " = " + calcular.raiz_cuadrada(a));
			break;
		case 6: // En el caso de la raíz cubica, introducimos un valor y realizamos el calculo
			System.out.println("Raiz cubica de " + a + " = " + calcular.raiz_cubica(a));
			break;
		case 7: // En el caso de la división, introducimos dos valores y los dividimos, comprobando que ninguno de ellos sea == a 0
			System.out.println(a + " / " + b + " = " + calcular.division(a,b));
			break;
		default: /* Si llegamos al caso predeterminado significa que el número entero 
				 introducido por el usuario no esta siendo controlado en el switch */
			System.out.println("¡Operación no valida!");
			break;
		}
	}

	/* Método al que le pasamos por parámetro dos valores y el scanner para
	   actualizar el valor de la posición de memória que contienen estas variables */
	public static void introducirDosValores(double a, double b, Scanner sc) {
		System.out.println("Introduce un valor A: ");
		a = sc.nextDouble();
		System.out.println("Introduce un valor B: ");
		b = sc.nextDouble();
	}

	/* Método al que le pasamos por parámetro un valor y el scanner para actualizar
	   el valor de la posición de memória que contiene esta variable */
	public static void introducirUnValor(double a, Scanner sc) {
		System.out.println("Introduce un valor A: ");
		a = sc.nextDouble();
	}

}
