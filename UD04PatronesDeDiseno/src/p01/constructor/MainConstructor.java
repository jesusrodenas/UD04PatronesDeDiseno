package p01.constructor;

/**
 * El patrón Constructor (Builder) se utiliza para crear objetos complejos paso a paso, 
 * en lugar de tener un constructor con muchos parámetros. 
 * Esto mejora la legibilidad y la mantenibilidad del código, evitando constructores con muchos parámetros.
 */
public class MainConstructor {
	public static void main(String[] args) {
		// Creando un coche con el Builder
		Coche coche1 = new Coche.CocheBuilder()
				.setMarca("Toyota")
				.setModelo("Corolla")
				.setAño(2023)
				.setColor("Rojo")
				.build();

		// Mostramos la información del coche
		coche1.mostrarInfo();
	}
}