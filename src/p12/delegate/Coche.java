package p12.delegate;

class Coche {
	Motor m;
	
	Coche(Motor m){
		this.m = m;
	}
	
	void avanza() {
		this.m.avanza();
	}
}