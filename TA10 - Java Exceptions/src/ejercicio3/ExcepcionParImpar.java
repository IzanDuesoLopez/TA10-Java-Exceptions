package ejercicio3;

public class ExcepcionParImpar extends Exception{
	// Atributos
	private boolean esParOImpar;
	private final static String EXCEPCION_UNO = "Es par";
	private final static String EXCEPCION_DOS = "Es impar";

	// Constructores
	public ExcepcionParImpar() {
			super();
		}

	public ExcepcionParImpar(boolean esParOImpar) {
			super();
			this.esParOImpar = esParOImpar;
		}

	// Metodo mostrar mensaje excepcion
	public String getMessage() {

		int resultante = 0;
		String resultado = ""; // Almacenamos el mensaje resultante
		
		if(this.esParOImpar) {
			resultante = 1;
		}
		
		// Switch con el codigo de la excepcion
		switch (resultante) {
		// Comprobamos los diferentes casos
		case 1:
			resultado = EXCEPCION_UNO;
			break;
		case 0:
			resultado = EXCEPCION_DOS;
			break;
		}

		// Devolvemos el mensaje resultante
		return resultado;
	}
}
