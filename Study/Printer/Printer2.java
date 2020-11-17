package P1;

class Printer_class2 {

	private int numOfPapers = 0;
	
	Printer_class2(int n) {
		numOfPapers = n;
	}
	
	void print(int amount) {
		if(numOfPapers == 0) System.out.println("용지가 없습니다.\n");
		else if(numOfPapers < amount) {
			System.out.printf("모두 출력하려면 %d매 부족합니다. %d장만 출력합니다.\n", -(numOfPapers - amount), numOfPapers);
			numOfPapers = 0;
		} else {
			numOfPapers -= amount;
			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
		}
	}
}

public class Printer2 {
	public static void main(String[] args) {
		Printer_class2 p = new Printer_class2(10);
		p.print(2);
		p.print(20);
		p.print(10);
	}
}
