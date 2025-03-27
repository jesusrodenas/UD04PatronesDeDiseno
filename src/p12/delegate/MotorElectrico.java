package p12.delegate;

public class MotorElectrico implements Motor {

	@Override
	public void avanza() {
		System.out.println("Motor eléctrico avanzando.");
	}
}
