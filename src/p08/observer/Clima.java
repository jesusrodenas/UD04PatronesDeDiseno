package p08.observer;

import java.util.ArrayList;
import java.util.List;

class Clima implements Sujeto {
	private List<Observer> observers;
	private double temperatura;

	public Clima() {
		observers = new ArrayList<>();
	}

	@Override
	public void agregarObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void quitarObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notificarObservers() {
		for (Observer observer : observers) {
			observer.actualizar(temperatura);
		}
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		notificarObservers(); // Notifica a todos los observadores sobre el cambio
	}
}