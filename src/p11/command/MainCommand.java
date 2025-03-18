package p11.command;

/**
 * - Desacoplamiento: El objeto que solicita la acción no necesita saber cómo se lleva a cabo, 
 *   solo que se invoca el comando.
 * - Flexibilidad: Puedes parametrizar los comandos, hacer cola de comandos, 
 *   e incluso realizar operaciones como deshacer.
 * - Extensibilidad: Se pueden agregar nuevos comandos sin modificar el código de las clases existentes, 
 *   solo creando nuevas clases de comandos.
 * 
 * - Este patrón es útil en aplicaciones donde necesitas emitir comandos a objetos sin necesidad de invocar 
 *   directamente sus métodos, como en interfaces gráficas, colas de procesamiento, o sistemas de deshacer/rehacer.
 */
public class MainCommand {
	public static void main(String[] args) {
		// Crear el receptor
		Luz luz = new Luz();

		// Crear los comandos
		Comando encenderLuz = new EncenderLuzComando(luz);
		Comando apagarLuz = new ApagarLuzComando(luz);

		// Crear el invocador
		ControlRemoto controlRemoto = new ControlRemoto();

		// Encender la luz
		controlRemoto.setComando(encenderLuz);
		controlRemoto.presionarBoton();

		// Apagar la luz
		controlRemoto.setComando(apagarLuz);
		controlRemoto.presionarBoton();
	}
}
