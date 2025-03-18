package p07.decorator;

//Implementación base: Café simple
class CafeSimple implements Cafe {
	@Override
	public String getDescripcion() {
		return "Café simple";
	}

	@Override
	public double getCosto() {
		return 2.0;
	}
}