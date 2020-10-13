import java.util.Scanner;

public class NotationChange {
	public static void main(String[] args) {
		int a, data = 0;
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("입력진수 결정 <1>10 <2>16 <3>8 ");
		a = s.nextInt();

		System.out.println("값 입력 :");
		if(a == 1) {
			str = s.next();
			data = Integer.parseInt(str, 10);
		}
		
		if(a == 2) {
			str = s.next();
			data = Integer.parseInt(str, 16);
		}
		
		if(a == 3) {
			str = s.next();
			data = Integer.parseInt(str, 8);
		}
		System.out.printf("10진수 ==> %d\n", data);
		System.out.printf("16진수 ==> %x\n", data);
		System.out.printf("8진수 ==> %o\n", data);
	}
}
