package p12.delegate;

public class Coche {
	Motor m;
	
	public Coche(Motor m){
		this.m = m;
	}
	
	public void avanza() {
		this.m.avanza();
	}
}