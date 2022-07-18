package ejercicio2;

public class ExcepcionMainApp {

	public static void main(String[] args) {
		funcionalidad(); // Llamamos al método funcionalidad del programa
	}

	// Método en el que lanzamos las diferentes excepciones customizadas
	public static void funcionalidad() {
		int num;
		try {
			num = 91;
			if (num >= 100) {
				throw new ExcepcionCustomizada(1); // Lanzamos la excepción customizada con el mensaje 1
			} else if (num <= 90) {
				throw new ExcepcionCustomizada(2); // Lanzamos la excepción customizada con el mensaje 2
			} else if (num == 91) {
				throw new ExcepcionCustomizada(3); // Lanzamos la excepción customizada con el mensaje 3
			}

		} catch (ExcepcionCustomizada ex) {
			System.out.println("Mensaje mostrado por pantalla\nExcepción capturada con el mensaje: " + ex.getMessage() + "\nPrograma terminado");
		}
	}
}