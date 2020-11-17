package P1;

class Printer_class3 {
	private int numOfPapers;
	private boolean duplex;
	
	public Printer_class3(int n, boolean d) {
		numOfPapers = n;
		duplex = d;
	}
	
	void print(int amount) {
		if(getDuplex()) {
			amount = (amount % 2 == 0) ? amount / 2 : amount / 2 + 1;
			System.out.print("양면으로 ");
		}
		
		if(numOfPapers == 0) System.out.println("용지가 없습니다.\n");
		else if(numOfPapers < amount) {
			System.out.printf("모두 출력하려면 %d매 부족합니다. %d장만 출력합니다.\n", -(numOfPapers - amount), numOfPapers);
			numOfPapers = 0;
		} else {
			numOfPapers -= amount;
			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
		}
	}
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}

public class Printer3 {
	public static void main(String[] args) {
		Printer_class3 p = new Printer_class3(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}
}
