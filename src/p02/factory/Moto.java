package p02.factory;

class Moto extends Vehiculo {
	public Moto(String marca) {
        super(marca);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto de marca: " + marca);
    }
}