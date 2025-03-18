package p01.constructor;

//Clase Coche con atributos privados
class Coche {
	private String marca;
	private String modelo;
	private int año;
	private String color;

	// Constructor privado, solo accesible desde el Builder
	private Coche(CocheBuilder builder) {
		this.marca = builder.marca;
		this.modelo = builder.modelo;
		this.año = builder.año;
		this.color = builder.color;
	}

	// Método para mostrar la información del coche
	public void mostrarInfo() {
		System.out.println("Coche: " + marca + " " + modelo + " (" + año + ") - Color: " + color);
	}

	// Clase estática interna: Builder
	public static class CocheBuilder {
		private String marca;
		private String modelo;
		private int año;
		private String color;

		// Métodos para establecer cada atributo y devolver el Builder
		public CocheBuilder setMarca(String marca) {
			this.marca = marca;
			return this;
		}

		public CocheBuilder setModelo(String modelo) {
			this.modelo = modelo;
			return this;
		}

		public CocheBuilder setAño(int año) {
			this.año = año;
			return this;
		}

		public CocheBuilder setColor(String color) {
			this.color = color;
			return this;
		}

		// Método para construir el objeto Coche
		public Coche build() {
			return new Coche(this);
		}
	}
}