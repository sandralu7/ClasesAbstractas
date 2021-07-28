package co.com.claseabstracta;

public class Main {

	public static void main(String[] args) {
		Animal perro = new Perro();
		perro.setNombre("Tobi");
		perro.comer();
		perro.caminar();
		perro.sonido();
		
		Labrador perro2 = new Labrador();
		perro2.setNombre("Luna");
		perro2.color();
		
		Animal gato = new Gato();
		gato.setNombre("Lucky");
		gato.comer();
		gato.caminar();
		gato.sonido();

	}

}
