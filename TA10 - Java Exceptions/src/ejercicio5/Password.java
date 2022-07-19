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
		return "";
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
