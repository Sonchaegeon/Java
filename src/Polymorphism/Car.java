package Polymorphism;

public class Car {
	
//	Tire frontLeftTire = new HankookTire();
//	Tire frontRightTire = new HankookTire();
//	Tire backLeftTire = new HankookTire();
//	Tire backRightTire = new HankookTire();
//	
//	void run() {
//		frontLeftTire.roll();
//		frontRightTire.roll();
//		backLeftTire.roll();
//		backRightTire.roll();
//	}
	
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
