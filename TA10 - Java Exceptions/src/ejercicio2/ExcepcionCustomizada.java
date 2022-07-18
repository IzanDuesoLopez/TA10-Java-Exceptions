package ejercicio2;

public class ExcepcionCustomizada extends Exception{
	
	// Atributos
	private int codigo;
	private final static String EXCEPCION_UNO = "Excepción 1. Reinicie Eclipse para corregir comportamiento";
	private final static String EXCEPCION_DOS = "Excepción 2. Reinicie su equipo.";
	private final static String EXCEPCION_TRES = "Excepción 3. Apague su equipo y desconéctelo de la corriente.";
	private final static String EXCEPCION_CUATRO = "Excepción desconocida.";
	
	// Constructores
	public ExcepcionCustomizada() {
		super();
	}
	
	public ExcepcionCustomizada(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	// Metodo mostrar mensaje excepcion
	public String getMessage() {
		
		String resultado = ""; // Almacenamos el mensaje resultante
		
		// Switch con el codigo de la excepcion
		switch(this.codigo) {
		// Comprobamos los diferentes casos
		case 1:
			resultado = EXCEPCION_UNO;
			break;
		case 2:
			resultado = EXCEPCION_DOS;
			break;
		case 3:
			resultado = EXCEPCION_TRES;
			break;
		default:
			resultado = EXCEPCION_CUATRO;
			break;
		}
		
		// Devolvemos el mensaje resultante
		return resultado;
	}
}
