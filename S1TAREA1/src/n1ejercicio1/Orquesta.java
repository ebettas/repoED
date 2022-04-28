package n1ejercicio1;

public class Orquesta {

	public static void main(String[] args) {
				
		System.out.println("Vamos a formar la orquesta");
		
		Cuerda.setCantCuerdas(6);
		
		Viento flauta = new Viento("flauta",600.00);

		flauta.tocar();
		
		Cuerda guitarra= new Cuerda("guitarra",2000);
		
		System.out.println(guitarra.toString());
		
		guitarra.tocar();
		
		Percusion.ritmo();
		
		Percusion bateria= new Percusion("bateria",10000) ;
		bateria.tocar();
	}		
}