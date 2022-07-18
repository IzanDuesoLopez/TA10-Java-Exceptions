package ejercicio3;

public class Ejercicio3MainApp {

	public static void main(String[] args) {
		ParImpar par_impar = new ParImpar();
		
		par_impar.esParOImpar();
		System.out.println("Generando número aleatorio...");
		System.out.println("El número aleatorio generado es: " + par_impar.getNumero());
		par_impar.capturaNumeroComprobarExcepcion();
	}

}
