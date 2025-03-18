package p07.decorator;

//Decorador concreto: Agrega leche al café
class ConLeche extends CafeDecorador {
	public ConLeche(Cafe cafe) {
		super(cafe);
	}

	@Override
	public String getDescripcion() {
		return cafe.getDescripcion() + ", con leche";
	}

	@Override
	public double getCosto() {
		return cafe.getCosto() + 0.5;
	}
}