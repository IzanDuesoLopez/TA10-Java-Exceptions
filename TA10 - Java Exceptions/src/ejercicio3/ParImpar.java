package ejercicio3;

import java.util.Random;

public class ParImpar {

	// Atributos
	private int numero;
	
	// Constructores
	public ParImpar() {
		this.numero = 0;
	}
	
	// método generarNumAleatorio()
	
	public int numeroAleatorio() {
		int minimo = 0;
		int maximo =999;
		Random numRandom = new Random();

		int numeroAleatorio = numRandom.nextInt((maximo - minimo) + 1) + minimo;

		return numeroAleatorio;
	}
	
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
