package p09.strategy;

class PagoConPayPal implements EstrategiaPago {

	public void pagar(double importe) {
		System.out.println("Pagando " + importe + " con PayPal.");
	}
}