package n1ejercicio1;

public class Viento extends Instrumento  {

	
	public Viento (String nombre, double precio)	{
		super(nombre,precio);
		System.out.println("Se ha agregado un viento a la orquesta");
	}
	public void tocar()  {
		System.out.println("Está sonando un instrumento de viento");
	}
}
