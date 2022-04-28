package n1ejercicio1;

public class Percusion extends Instrumento {
	
	public Percusion (String nombre, double precio)	{
		super(nombre,precio);
		System.out.println("Se ha agregado un instrumento de percusión a la orquesta");
	}
	static void ritmo () {
		System.out.println("Soy el instrumento que lleva el ritmo");
	}
	{
		System.out.println("Se ha cargado la clase Percusion");
	}
	
	
	public void tocar()  {
		System.out.println("Está sonando un instrumento de percusión");
	}
}
