package ejercicio2;

public class ExcepcionCustomizada extends Exception{
	
	// Atributos
	private int codigo;
	
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
		switch(codigoExcepcion) {
		// Comprobamos los diferentes casos
		case 1:
			resultado = "";
			break;
		case 2:
			resultado = "";
			break;
		case 3:
			resultado = "";
			break;
		default:
			resultado = "";
			break;
		}
		
		// Devolvemos el mensaje resultante
		return resultado;
	}
}
