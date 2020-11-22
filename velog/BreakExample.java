
public class BreakExample {
	public static void main(String[] args) {
		int i = 1;
		while(true) {
			if(i == 6) break;
			System.out.println(i);
			i++;
		}
		System.out.println("프로그램 종료!");
	}
}
