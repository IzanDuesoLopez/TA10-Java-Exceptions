package ejercicio4;

public class ExcepcionPropia extends Exception{
	// Atributos
	private int codigo;
	private final static String EXCEPCION_UNO = "El resultado es un número irreal.";
	private final static String EXCEPCION_DOS = "El resultado es un número infinito.";
	private final static String EXCEPCION_TRES = "Excepción desconocida.";
	
	// Constructores
	public ExcepcionPropia() {
		super();
	}
	
	public ExcepcionPropia(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	// Método para mostrar mensaje personalizado
	@Override
	public String getMessage() {

		String mensaje = ""; // Almacenamos el mensaje resultante

		// Switch con el codigo de la excepcion
		switch(codigo) {
		// Comprobamos los diferentes casos
		case 1:
			mensaje = EXCEPCION_UNO;
			break;
		case 2:
			mensaje = EXCEPCION_DOS;
			break;
		default:
			mensaje = EXCEPCION_TRES;
			break;
		}

		// Devolvemos el mensaje resultante
		return mensaje;
	}
}
