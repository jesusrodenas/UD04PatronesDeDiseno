package p02.factory;

/**
 * El patrón Factoría (Factory Method) permite crear objetos sin especificar la clase
 * exacta del objeto que se creará. Se basa en una superclase común y en una clase factoría 
 * que decide qué tipo de objeto instanciar en función de un parámetro. 
 * - Permite añadir nuevos tipos de vehículos sin modificar el código existente (Principio Abierto/Cerrado).
 * - Hace que la creación de objetos sea centralizada.
 */
public class MainFactoria {
	public static void main(String[] args) {
		// Creamos diferentes vehículos usando la fábrica
		Vehiculo vehiculo1 = VehiculoFactory.crearVehiculo("coche", "Toyota");
		Vehiculo vehiculo2 = VehiculoFactory.crearVehiculo("moto", "Honda");
		Vehiculo vehiculo3 = VehiculoFactory.crearVehiculo("patinete", "Seat");

		// Mostramos la información de los vehículos
		vehiculo1.mostrarInfo();
		vehiculo2.mostrarInfo();
		vehiculo3.mostrarInfo();
	}
}