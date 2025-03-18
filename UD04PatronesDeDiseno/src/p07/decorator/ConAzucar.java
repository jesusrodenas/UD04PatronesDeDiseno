package p07.decorator;

//Decorador concreto: Agrega azúcar al café
class ConAzucar extends CafeDecorador {
	public ConAzucar(Cafe cafe) {
		super(cafe);
	}

	@Override
	public String getDescripcion() {
		return cafe.getDescripcion() + ", con azúcar";
	}

	@Override
	public double getCosto() {
		return cafe.getCosto() + 0.3;
	}
}