package p02.factory;

public abstract class Vehiculo {
	protected String marca;

	public Vehiculo(String marca) {
        this.marca = marca;
    }

	public abstract void mostrarInfo();
}
