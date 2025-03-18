package p08.observer;

/**
 * El patrón Observer permite que un objeto notifique a otros objetos sobre
 * cambios en su estado sin necesidad de saber quién está escuchando o cómo
 * están implementados los objetos que responden. Es útil cuando uno o varios
 * objetos necesitan ser informados de un cambio de estado en otro objeto.
 * 
 * magina que tienes una aplicación de clima. La clase Clima cambia de estado
 * (por ejemplo, cambia la temperatura), y necesitas que varios observadores
 * (como DisplayTemperatura, AlertasClima) se actualicen con la nueva
 * información.
 * 
 * - Interfaz Observer: Define el método actualizar(), que será implementado por los 
 * objetos que deseen recibir notificaciones del sujeto.
 * - Interfaz Sujeto: Define métodos para agregar, quitar y notificar a los observadores.
 * - Clase Clima: Implementa Sujeto y mantiene una lista de observadores. Cada vez que cambia la temperatura, 
 * notifica a todos los observadores.
 * - Clases DisplayTemperatura y AlertaClima: Son observadores que reaccionan ante cambios en la temperatura, 
 * mostrando la nueva temperatura y alertando sobre condiciones extremas.
 * Uso: Cuando se actualiza la temperatura en la clase Clima, todos los observadores son notificados automáticamente.
 * 
 * Ventajas: 
 * Desacoplamiento → El sujeto no necesita conocer la implementación de los observadores, solo notifica que ha cambiado.
 * Flexibilidad → Se pueden agregar o quitar observadores de manera dinámica sin afectar el código del sujeto.
 * Escalabilidad → Ideal para situaciones en las que un cambio en el estado de un objeto debe reflejarse en múltiples objetos dependientes.
 */
public class MainObserver {
	public static void main(String[] args) {
		// Crear el objeto Sujeto (Clima)
		Clima clima = new Clima();

		// Crear objetos Observer
		DisplayTemperatura display = new DisplayTemperatura();
		AlertaClima alerta = new AlertaClima();

		// Agregar observadores
		clima.agregarObserver(display);
		clima.agregarObserver(alerta);

		// Cambiar temperatura y notificar a los observadores
		clima.setTemperatura(35.0); // La temperatura sube a 35°C
		clima.setTemperatura(-5.0); // La temperatura baja a -5°C
	}
}
