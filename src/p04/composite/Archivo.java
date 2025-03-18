package p04.composite;

/**
 * Clase Archivo (Hoja): Representa un archivo individual
 */
class Archivo implements Elemento {
	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void mostrar() {
		System.out.println("Archivo: " + nombre);
	}
}