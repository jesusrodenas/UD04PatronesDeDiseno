package p10.visitor;

class Planta implements Elemento {
	private String nombre;

	public Planta(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void aceptar(Visitador visitador) {
		visitador.visitar(this);
	}
}