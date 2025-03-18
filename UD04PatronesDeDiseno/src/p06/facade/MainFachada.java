package p06.facade;

/** El patrón Fachada (Facade) proporciona una interfaz simplificada para un sistema complejo, 
 *  ocultando los detalles internos. Esto hace que el código sea más fácil de usar y entender, 
 *  especialmente cuando se interactúa con varias clases al mismo tiempo.
 *  
 *  Imagina que tienes un sistema de compras online donde un cliente quiere comprar un producto. 
 *  Sin Fachada, tendría que interactuar manualmente con múltiples clases:
 *  
 *  Inventario: Para verificar si hay stock.
 *  Pago: Para procesar el pago.
 *  Envío: Para gestionar la entrega del pedido.
 *  
 *  - Reduce la complejidad → Agrupa múltiples llamadas en una sola función.
 *  - Fácil de usar → Proporciona una API más intuitiva para el cliente.
 *  - Facilita el mantenimiento → Si cambia la implementación interna, la interfaz permanece estable.
 *  - Promueve el principio de "Menos es más" → Evita que el usuario final tenga que preocuparse por los detalles internos.
 */
public class MainFachada {
	public static void main(String[] args) {
		FachadaTienda tienda = new FachadaTienda();

		tienda.comprarProducto("Laptop", "123456789", 1200.00);
		tienda.comprarProducto("Teléfono", "987654321", 800.00);
	}
}