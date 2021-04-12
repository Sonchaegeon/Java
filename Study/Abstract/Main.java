package abstract_study;

public class Main {
	// Phone phone = new Phone("손채건");
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("손채건");
		
		// Phone의 메소드
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
	}
}
