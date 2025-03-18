package p11.command;

//Clase Invocador: Responsable de invocar el comando
class ControlRemoto {
	private Comando comando;

	public void setComando(Comando comando) {
		this.comando = comando;
	}

	public void presionarBoton() {
		comando.ejecutar(); // Ejecuta la acción del comando
	}
}
