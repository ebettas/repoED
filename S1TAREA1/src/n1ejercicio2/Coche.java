package n1ejercicio2;

public class Coche {
	static final String marca="BMW";
	static String modelo;
	final int potencia;
	
	public Coche (String modelo, int potencia) {
		Coche.modelo=modelo;
		this.potencia=potencia;
	}
	
	static void frenar() {
		System.out.println("El coche ha frenado");
	}
	public void acelerar() {
		System.out.println("El coche esta acelerando");
	}
	public int getPotencia() {
		return potencia;
	}
	@Override
	public String toString() {
		return "Coche [marca="+marca + ", modelo= " +modelo +", potencia=" + potencia + "]";
	}

	static void setModelo(String modelo) {
		Coche.modelo=modelo;
	}
	
}