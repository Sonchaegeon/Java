package P1;

public class StringTest {
	public static void main(String[] args) {
		String a = "Hi";
		String b = "Hi";
		
		if(a == b) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String c = new String("hi");
		String d = new String("hi");
		
		if(c == d) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
