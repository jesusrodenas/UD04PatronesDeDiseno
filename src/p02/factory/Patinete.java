package p02.factory;

public class Patinete extends Vehiculo {
	
	public Patinete(String marca) {
		super(marca);
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Soy un patinete");
	}
}
