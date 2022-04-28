package n1ejercicio1;

abstract class Instrumento {
	protected String nombre;
	protected double precio;
	
	public Instrumento (String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public abstract void tocar();
	
}
