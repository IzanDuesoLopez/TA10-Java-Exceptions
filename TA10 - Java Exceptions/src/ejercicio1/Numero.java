package ejercicio1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Numero {

	// Atributos
	private int numero;
	private int numeroIntentos;

	// Constructor
	public Numero() {
		this.numero = numeroAleatorio();
		this.numeroIntentos = 0;
	}

	// Metodo que genere número entre 1 y 500
	public int numeroAleatorio() {
		int minimo = 1;
		int maximo = 500;
		Random numRandom = new Random();

		int numeroAleatorio = numRandom.nextInt((maximo - minimo) + 1) + minimo;

		return numeroAleatorio;
	}

	// Método adivinarNumero
	// Comprobar si es un número, si no lo es incrementar resultados. Utilizar la
	// Excepcion InputMismatchException
	public boolean adivinarNumero() {
		Scanner sc = new Scanner(System.in);
		int numero = -1;

		System.out.println("Escribir número:");

		try {
			while (numero != this.numero) {
				numero = sc.nextInt();
				if (this.numero < numero) {
					System.out.println("El número es más pequeño.");
					numeroIntentos++;
				} else if (this.numero > numero) {
					System.out.println("El número es más grande.");
					numeroIntentos++;
				} else if (this.numero == numero) {
					conseguirAdivinarlo(); 
				}
			}
		
		} catch (InputMismatchException e) {
			System.out.println("Eso no es un número" + e.getMessage());
		}

		sc.close();

		return true;
	}
	
	// Método conseguirAdivinarlo
	public void conseguirAdivinarlo() {
		System.out.println(
				"Felicidades, conseguiste adivinar el número" + "\nTú número de intentos ha sido: " + this.numeroIntentos);

	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroIntentos() {
		return numeroIntentos;
	}

	public void setNumeroIntentos(int numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}

	// Método toString
	@Override
	public String toString() {
		return "Numero [numero=" + numero + ", numeroIntentos=" + numeroIntentos + "]";
	}

}
