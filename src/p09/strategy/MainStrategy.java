package p09.strategy;

/**
 * El patrón Strategy permite que un objeto altere su comportamiento en tiempo
 * de ejecución. En lugar de tener múltiples clases con un comportamiento
 * diferente, puedes agrupar diferentes estrategias en una única variable y
 * cambiar entre ellas de manera dinámica.
 * 
 * Ejemplo de uso: Imagina que estás desarrollando un sistema de pago para una
 * tienda en línea, y tienes diferentes estrategias de pago como tarjeta de
 * crédito, PayPal y transferencia bancaria. Usando el patrón Strategy, puedes
 * cambiar fácilmente entre las estrategias de pago sin modificar la clase que
 * las utiliza.
 * 
 * Flexibilidad: Cambia el comportamiento de un objeto en tiempo de ejecución
 * sin modificar su código. Desacoplamiento: Separa el comportamiento de la
 * clase que lo utiliza, permitiendo agregar nuevas estrategias sin cambiar el
 * código existente. Escalabilidad: Nuevas estrategias se pueden agregar
 * fácilmente sin alterar la estructura principal.
 * 
 * Este patrón es muy útil cuando tienes múltiples variantes de un
 * comportamiento que pueden ser seleccionadas o cambiadas de manera dinámica.
 */
public class MainStrategy {
	public static void main(String[] args) {
		// Crear una tienda con pago por tarjeta
		TiendaOnline tienda = new TiendaOnline(new PagoConTarjeta());
		tienda.realizarPago(100.0);

		// Cambiar la estrategia de pago a PayPal
		tienda.cambiarEstrategiaPago(new PagoConPayPal());
		tienda.realizarPago(200.0);

		// Cambiar la estrategia de pago a transferencia bancaria
		tienda.cambiarEstrategiaPago(new PagoConTransferencia());
		tienda.realizarPago(300.0);
	}
}
