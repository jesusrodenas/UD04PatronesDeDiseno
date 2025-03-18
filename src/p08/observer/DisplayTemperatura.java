package p08.observer;

//Clase concreta Observer: Display de temperatura
class DisplayTemperatura implements Observer {
	@Override
	public void actualizar(double temperatura) {
		System.out.println("La temperatura actual es: " + temperatura + "°C");
	}
}