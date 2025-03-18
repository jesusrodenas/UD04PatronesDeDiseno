package p06.facade;

//Fachada: Simplifica el proceso de compra
class FachadaTienda {
	private Inventario inventario;
	private Pago pago;
	private Envio envio;

	public FachadaTienda() {
		this.inventario = new Inventario();
		this.pago = new Pago();
		this.envio = new Envio();
	}

	public void comprarProducto(String producto, String cuenta, double monto) {
		if (inventario.verificarStock(producto)) {
			pago.procesarPago(cuenta, monto);
			envio.gestionarEnvio(producto);
			System.out.println("Compra completada con éxito.\n");
		} else {
			System.out.println("No hay stock disponible para: " + producto);
		}
	}
}