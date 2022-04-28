package n1ejercicio1;

public class Cuerda extends Instrumento {
	static int cantCuerdas;
	
	public Cuerda (String nombre, double precio)	{
		super(nombre,precio);
		cantCuerdas=5;
		System.out.println("Finalmente estoy en la orquesta");
	}
	static {
		System.out.println("Soy una guitarra que quiere ingresar en la orquesta");
	}
	public static void setCantCuerdas(int cantCuerdas) {
		Cuerda.cantCuerdas=cantCuerdas;
		System.out.println("Todos las guitarras tenemos "+cantCuerdas+" cuerdas");
	}
	
	public void tocar()  {
		System.out.println("Está sonando un instrumento de cuerda");
	}

	@Override
	public String toString() {
		return "Instrumento de cuerda: nombre:" + nombre + ", precio:" + precio + ", cantidad de cuerdas:"+cantCuerdas;
	}
	
}
