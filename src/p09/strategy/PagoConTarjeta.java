package p09.strategy;

class PagoConTarjeta implements EstrategiaPago {

	public void pagar(double monto) {
		System.out.println("Pagando " + monto + " con tarjeta de crédito.");
	}
}