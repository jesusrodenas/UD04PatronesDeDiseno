package p08.observer;

//Clase concreta Observer: Alerta de clima
class AlertaClima implements Observer {
	@Override
	public void actualizar(double temperatura) {
		if (temperatura > 30) {
			System.out.println("Alerta: Hace mucho calor!");
		} else if (temperatura < 0) {
			System.out.println("Alerta: Hace mucho frío!");
		}
	}
}