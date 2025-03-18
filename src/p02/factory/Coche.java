package p02.factory;

class Coche extends Vehiculo {

	public Coche(String marca) {
        super(marca);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche de marca: " + marca);
    }
}
