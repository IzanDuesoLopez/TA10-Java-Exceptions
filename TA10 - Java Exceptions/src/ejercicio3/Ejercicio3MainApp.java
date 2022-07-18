package ejercicio3;

public class Ejercicio3MainApp {

	public static void main(String[] args) {
		ParImpar par_impar = new ParImpar(); // Creamos una nueva instancia de la clase ParImpar
		
		par_impar.esParOImpar(); // Comprobamos si es par o impar
		System.out.println("Generando número aleatorio...");
		System.out.println("El número aleatorio generado es: " + par_impar.getNumero()); // Mostramos por pantalla el número generado aleatoriamente
		par_impar.capturaNumeroComprobarExcepcion(); // Mostramos la excepcion comprobando si es par o impar
	}

}
