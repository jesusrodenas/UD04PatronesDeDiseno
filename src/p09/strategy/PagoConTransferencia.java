package p09.strategy;

class PagoConTransferencia implements EstrategiaPago {

	public void pagar(double monto) {
		System.out.println("Pagando " + monto + " con transferencia.");
	}
}