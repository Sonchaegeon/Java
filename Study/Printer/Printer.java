package P1;

class Printer_class {
	int numOfPapers = 0;
	
	Printer_class(int n) {
		numOfPapers = n;
	}
	
	void print(int amount) {
		numOfPapers -= amount;
		System.out.println(numOfPapers);
	}
}

public class Printer {
	public static void main(String[] args) {
		Printer_class p = new Printer_class(100);
		p.print(70);
	}
}
