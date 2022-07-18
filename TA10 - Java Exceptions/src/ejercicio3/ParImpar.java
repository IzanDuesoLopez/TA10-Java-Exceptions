package ejercicio3;

public class ParImpar {

	// Atributos
	private int numero;
	
	// Constructores
	public ParImpar() {
		this.numero = 0;
	}
	
	// método generarNumAleatorio()
	
	// método comprobarEsParOImpar()
	public boolean esParOImpar() {
		if(this.numero % 2 == 0) { // Si es divisible entre 2 es par
			return true;	
		} else { // Si no lo es es impar
			return false;
		}
	}
	
	// método capturaNumeroComprobarExcepcion()
	
}
