package p12.delegate;

public class MainDelegate {

	public static void main(String[] args) {
		Coche toyotaAuris = new Coche(new MotorElectrico());
		Coche seatLeon = new Coche(new MotorGasolina());
		
		toyotaAuris.avanza();
		seatLeon.avanza();
	}
}