package interface_parameter;

public class Main {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		Bus bus2 = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}
}
