package p07.decorator;

/**
 * El patrón Decorador (Decorator) permite agregar funcionalidades a un objeto
 * dinámicamente, sin modificar su código fuente ni usar herencia. Se basa en la
 * composición, envolviendo un objeto dentro de otro que amplía su
 * comportamiento.
 * 
 * Imagina que estás desarrollando un sistema de cafetería donde se venden
 * distintos tipos de café: Puedes pedir un café simple. Puedes agregarle leche,
 * azúcar o canela. Cada adición modifica el precio y la descripción del café.
 * En lugar de crear muchas clases con combinaciones (CaféConLeche,
 * CaféConAzúcar, etc.), usamos el patrón Decorador para envolver dinámicamente
 * un café con distintos ingredientes.
 */
public class MainDecorator {
	public static void main(String[] args) {
		// Café simple
		Cafe cafe = new CafeSimple();
		System.out.println(cafe.getDescripcion() + " - $" + cafe.getCosto());

		// Café con leche
		Cafe cafeConLeche = new ConLeche(cafe);
		System.out.println(cafeConLeche.getDescripcion() + " - $" + cafeConLeche.getCosto());

		// Café con leche y azúcar
		Cafe cafeCompleto = new ConAzucar(cafeConLeche);
		System.out.println(cafeCompleto.getDescripcion() + " - $" + cafeCompleto.getCosto());
	}
}
