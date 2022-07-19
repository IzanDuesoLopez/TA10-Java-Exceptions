package ejercicio5;

public class Password {
	// Atributos
	private int longitud;
	private String contrasena;
	
	// Constructor por defecto. Longitud = 8
	public Password() {
		this.longitud = 8;
	}
	// Constructor con la longitud que le pasemos. Genera contraseña aleatoria
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword();
		
	}
	/* Método esFuerte(). Devuelve un booleano si es fuerte o no. Para que sea
	   fuerte debe tener mas de 2 mayusculas, mas de 1 minuscula y mas de 5 números */
	
	/* Método generarPassword() genera la contraseña del objeto con 
	   la longitud que tengamos  */
	public String generarPassword() {
		// Posibles carácteres que utilizaremos al generar la contraseña
		String caracteres = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		// StringBuilder en el que iremos concatenando los caracteres elegidos aleatoriamente
		StringBuilder resultado = new StringBuilder(this.longitud);
		
		//Variable donde guardaremos el carácter aleatorio generado con Math.random()
		int caracterAleatorio = 0;
		
		// FOR con la longitud establecida por parámetro
		for (int i = 0; i < this.longitud; i++) {
			// El caracter aleatorio 
			caracterAleatorio = (int) (caracteres.length() * Math.random());
			// Concatenamos a la StringBuilder el charat del entero generado anteriormente
			resultado.append(caracteres.charAt(caracterAleatorio));
		}
		
		// Devolvemos la StringBuilder pasandola primero a String
		return resultado.toString();
	}
	
	// Getters de contraseña y longitud
	public int getLongitud() {
		return longitud;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	// Setter para la longitud
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}
