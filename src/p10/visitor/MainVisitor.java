package p10.visitor;

/**
 * El patrón Visitador permite agregar nuevos métodos a clases sin cambiar su
 * estructura. Es útil cuando deseas realizar las mismas operaciones en varios
 * objetos diferentes. El visitador separa el comportamiento de los objetos,
 * permitiendo que los objetos permanezcan sin cambios mientras que el
 * comportamiento se define en un lugar externo.
 * 
 * -Permite agregar nuevas operaciones sin modificar las clases de los objetos.
 * -Facilita la adición de comportamientos sin alterar el código de las clases 
 * que están siendo visitadas.
 * -Mantiene el principio de abierto/cerrado de la programación orientada a objetos: 
 * puedes extender el comportamiento de las clases sin modificarlas directamente.
 * 
 * Este patrón es útil en escenarios donde necesitas aplicar varias operaciones a una estructura de objetos, como por ejemplo recorrer una jerarquía de clases o 
 * realizar cálculos en diferentes tipos de elementos.
 */
public class MainVisitor {
	public static void main(String[] args) {
		// Crear elementos
		Elemento perro = new Animal("Perro");
		Elemento arbol = new Planta("Árbol");

		// Crear un visitador
		Visitador visitador = new VisitadorConcreto();

		// Aceptar el visitador y realizar la acción
		perro.aceptar(visitador);
		arbol.aceptar(visitador);
	}
}
