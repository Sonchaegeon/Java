public class SwitchExample {
	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다!");
			break;
		case 2:
			System.out.println("2번이 나왔습니다!");
			break;
		case 3:
			System.out.println("3번이 나왔습니다!");
			break;
		case 4:
			System.out.println("4번이 나왔습니다!");
			break;
		default:
			System.out.println("1~4번의 숫자를 입력해주세요!");
			break;
		}
	}
}
