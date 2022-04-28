package n1ejercicio2;

public class App {

	public static void main(String[] args) {
		
		Coche miCoche= new Coche("I7",550);
		
		System.out.println(miCoche.toString());

		Coche miCoche2= new Coche("M235i",490);
		
		System.out.println(miCoche2.toString());
		
		System.out.println(miCoche.toString());
		
		System.out.println(miCoche.potencia);
		System.out.println(miCoche2.potencia);
		
		Coche.frenar();
		
		miCoche.frenar(); //Warning método estático es mejor acceder con nombre de clase 
		
		miCoche.acelerar();
		//Coche.acelerar(); No se puede acceder de forma estática a un método publico
	
	}
}
