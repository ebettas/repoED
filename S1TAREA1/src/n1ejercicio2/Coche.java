package n1ejercicio2;

public class Coche {
	static final String marca="BMW";
	static String modelo;
	final int potencia=500;
	
	public Coche (String modelo) {
		Coche.modelo=modelo;
	}
	static void frenar() {
		System.out.println("El coche ha frenado");
	}
	public void acelerar() {
		System.out.println("El coche esta acelerando");
	}
	public void setPotencia(int potencia) {
		this.potencia=potencia;
	}
	@Override
	public String toString() {
		return "Coche [marca="+marca + ", modelo= " +modelo +", potencia=" + potencia + "]";
	}

	static void setModelo(String modelo) {
		Coche.modelo=modelo;
	}
	
}