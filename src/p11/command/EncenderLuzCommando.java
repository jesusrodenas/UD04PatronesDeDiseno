package p11.command;

class EncenderLuzComando implements Comando {
	private Luz luz;

	public EncenderLuzComando(Luz luz) {
		this.luz = luz;
	}

	@Override
	public void ejecutar() {
		luz.encender();
	}
}