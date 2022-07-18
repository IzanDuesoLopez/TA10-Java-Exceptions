package ejercicio4;

public class Calculos {

	// Atributos
	private double a;
	private double b;
	private int potencia;
	
	// Constructores
	
	// suma
	public double suma() {
		double resultado = a + b;
		return resultado;
	}
	
	// resta
	public double resta() {
		double resultado  = a - b;
		return resultado;
	}
	
	// multiplicación
	public static double multiplicacion() {
		double resultado = a * b;
		return resultado;
	}
	
	// potencia
	public double potencia(double a, int potencia) {
		return Math.pow(a, potencia);
	}
	
	// raíz cuadrada
	public double raiz_cuadrada(double a) {
		return Math.sqrt(a);
	}
	
	// raíz cubica
	public double raiz_cubica(double a) {
		return Math.cbrt(a);
	}
	
	// raiz
	
	// división
	public double division() {
	    try {
	        double resultado  = a / b;
	         return resultado;
	    } catch (Exception) {
	        System.out.println("No se puede dividir un número entre 0")
	    }
	}
	
}
