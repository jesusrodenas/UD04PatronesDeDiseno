import p12.delegate.Motor;

public class MotorHidrogeno implements Motor, ElementoEtiquetado{

	@Override
	public void avanza() {
		System.out.println("Motor hidrógeno avanza.");
		
	}

	@Override
	public void generaEtiqueta() {
		System.out.println("Tu etiqueta tiene el cócido XXAABBCC55");
		
	}

}
