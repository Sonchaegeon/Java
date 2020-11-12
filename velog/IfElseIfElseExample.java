
public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 76;
		
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("점수가 70점 미만입니다...");
		}
	}
}
