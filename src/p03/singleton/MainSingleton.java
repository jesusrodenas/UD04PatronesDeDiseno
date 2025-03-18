package p03.singleton;

/**
 * El constructor es privado para evitar que se creen instancias desde fuera de la clase.
 * La instancia se almacena en una variable estática y se crea solo cuando es necesario (lazy initialization).
 * El método getInstancia() devuelve siempre la misma instancia, existe un ahorro de memoria: Solo hay una instancia en toda la aplicación.
 * Los valores compartidos permiten que cualquier parte del código acceda y modifique la misma instancia.
 * 
 * Útil para gestionar conexiones, logs o configuraciones.
 */
public class MainSingleton {
	public static void main(String[] args) {
		// Obtener la única instancia de Configuración
		Configuracion config1 = Configuracion.getInstancia();
		System.out.println("URL Base de Datos: " + config1.getUrlBaseDatos());

		// Modificamos la configuración desde otra parte del código
		Configuracion config2 = Configuracion.getInstancia();
		config2.setUrlBaseDatos("jdbc:mysql://localhost:3306/nuevaBD");

		// Verificamos que la instancia sigue siendo la misma
		System.out.println("URL Base de Datos actualizada: " + config1.getUrlBaseDatos());
	}
}