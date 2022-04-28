package n1ejercicio2;

public class App {

	public static void main(String[] args) {
		
		Coche miCoche= new Coche("I7");
		
		System.out.println(miCoche.toString());

		Coche.frenar();
		
		miCoche.acelerar();
	
	}
}
