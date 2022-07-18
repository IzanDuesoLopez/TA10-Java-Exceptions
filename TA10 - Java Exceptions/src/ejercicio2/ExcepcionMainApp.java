package ejercicio2;

public class ExcepcionMainApp {

	public static void main(String[] args) {

		int num;
		try {
			num = 91;
			if (num >= 100) { throw new ExcepcionCustomizada(1); }
			else if (num <= 90) { throw new ExcepcionCustomizada(2); }
			else if (num == 91 ) { throw new ExcepcionCustomizada(3); }

		} catch (ExcepcionCustomizada ex) {
			System.out.println(ex.getMessage());
		}

	}
}