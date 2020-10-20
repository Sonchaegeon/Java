import java.util.Scanner;

public class Study4 {
	public static void main(String[] args) {
		int len;
		String input;
		Scanner s = new Scanner(System.in);
		System.out.println("문자를 입력 : ");
		input = s.nextLine();
		System.out.printf("입력한 문자열 ==> %s\n", input);
		
		len = input.length();
		char[] reverse = new char[len];
		for(int i = 0; i < len; i++) {
			reverse[i] = input.charAt(i);
		}
		System.out.printf("변환된 문자열 ==> ");
		for(int i = len - 1; i >= 0; i--) {
			System.out.printf("%c", reverse[i]);
		}
		
	}
}
