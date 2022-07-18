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
		return a * b;
	}
	
	// la operación potencia a^potencia
	public double potencia(double a, int potencia) {
		return Math.pow(a, potencia);
	}
	
	// la operación raíz cuadrada a^1/2
	// Para las raices usamos la excepcion propia para que salte cuando el número sea negativo ya que daría un número irracional
	public double raiz_cuadrada(double a) {
		try {
			if(a < 0) throw new ExcepcionPropia(1);
		} catch(ExcepcionPropia e) {
			System.out.println(e.getMessage());
		}
		return Math.sqrt(a);
	}
	
	// la operación raíz cubica a^1/3
	// Para las raices usamos la excepcion propia para que salte cuando el número sea negativo ya que daría un número irracional
	public static double raiz_cubica(double a) {
		try {
			if(a < 0) { 
				throw new ExcepcionPropia(1);
			}
		} catch(ExcepcionPropia e) {
			System.out.println(e.getMessage());
		}
		return Math.cbrt(a);
	}
	
	// la operación división a/b (con la excepción de /0)
	public double division(double a, double b) {
	    try {
	    	if(a == 0 || b == 0) {
	    		throw new ExcepcionPropia(2);
	    	}
	    } catch (ExcepcionPropia e) {
	        System.out.println(e.getMessage());	      
	    }
	    	return a / b;
	}
}
	

