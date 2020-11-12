
public class IfNestedExample {
	public static void main(String[] args) {
		int score = 86;
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+");
			} else{
				System.out.println("B");
			}
		}
	}
}
