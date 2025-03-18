package p09.strategy;

class TiendaOnline {
	private EstrategiaPago estrategiaPago;

	public TiendaOnline(EstrategiaPago estrategiaPago) {
		this.estrategiaPago = estrategiaPago;
	}

	public void cambiarEstrategiaPago(EstrategiaPago nuevaEstrategia) {
		this.estrategiaPago = nuevaEstrategia;
	}

	public void realizarPago(double monto) {
		estrategiaPago.pagar(monto); // Utiliza la estrategia de pago seleccionada
	}
}