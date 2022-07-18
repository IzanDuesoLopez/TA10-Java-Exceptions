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
	
	// Hacemos las distintas operaciones del ejercicio
	
	// la operación suma a+b
	public double suma(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
	
	// la operación resta a-b
	public double resta(double a, double b) {
		double resultado  = a - b;
		return resultado;
	}
	
	// la operación multiplicación a*b
	public double multiplicacion(double a, double b) {
		return this.a * this.b;
	}
	
	// la operación potencia a^potencia
	public double potencia(double a, int potencia) {
		return Math.pow(a, potencia);
	}
	
	// Para las raices usamos la excepcion de que no se puede hacer 
	// la operación raíz cuadrada a^1/2
	public double raiz_cuadrada(double a) {
		return Math.sqrt(a);
	}
	
	// la operación raíz cubica a^1/3
	public static double raiz_cubica(double a) {
		return Math.cbrt(a);
	}
	
	// la operación división a/b (con la excepción de /0)
	public double division(double a, double b) {
	    try {
	        double resultado  = a / b;
	    } catch (Exception e) {
	        System.out.println("No se puede dividir un número entre 0");	      
	    }
	    	return a / b;
	}
}
	

