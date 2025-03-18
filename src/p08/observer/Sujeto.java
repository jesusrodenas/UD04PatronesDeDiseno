package p08.observer;

//Interfaz Sujeto
interface Sujeto {
	void agregarObserver(Observer observer);

	void quitarObserver(Observer observer);

	void notificarObservers();
}