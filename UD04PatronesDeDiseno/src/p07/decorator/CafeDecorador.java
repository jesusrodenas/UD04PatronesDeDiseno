package p07.decorator;

//Clase base para los decoradores
abstract class CafeDecorador implements Cafe {
	protected Cafe cafe;

	public CafeDecorador(Cafe cafe) {
		this.cafe = cafe;
	}

	@Override
	public String getDescripcion() {
		return cafe.getDescripcion();
	}

	@Override
	public double getCosto() {
		return cafe.getCosto();
	}
}