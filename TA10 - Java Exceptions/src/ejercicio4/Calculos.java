package ejercicio4;

public class Calculos {

	// Atributos
	private double a;
	private double b;
	private int potencia;
	
	// Constructores
	public Calculos() {
		super();
	}
	
	// suma
	public double suma(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
	
	// resta
	public double resta(double a, double b) {
		double resultado  = a - b;
		return resultado;
	}
	
	// multiplicación
	public double multiplicacion(double a, double b) {
		return this.a * this.b;
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
	public static double raiz_cubica(double a) {
		return Math.cbrt(a);
	}
	
	// división
	public double division(double a, double b) {
	    try {
	        double resultado  = a / b;
	    } catch (Exception e) {
	        System.out.println("No se puede dividir un número entre 0");	      
	    }
	    	return a / b;
	}
}
	

