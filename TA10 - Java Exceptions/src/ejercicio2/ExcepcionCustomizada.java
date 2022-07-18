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
		switch(this.codigo) {
		// Comprobamos los diferentes casos
		case 1:
			resultado = "Excepción 1. Reinicie Eclipse para corregir comportamiento";
			break;
		case 2:
			resultado = "Excepción 2. Reinicie su equipo.";
			break;
		case 3:
			resultado = "Excepción 3. Apague su equipo y desconéctelo de la corriente.";
			break;
		default:
			resultado = "Excepción desconocida.";
			break;
		}
		
		// Devolvemos el mensaje resultante
		return resultado;
	}
}
