import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		int n, q = 0, w = 0, e = 0, r = 0, t = 0;
		System.out.println(" ## 교환할 돈은 ? ");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		while(true) {
			if(n <= 0) break;
			if(n >= 500) {
				n -= 500;
				q++;
			} else if(n >= 100) {
				n -= 100;
				w++;
			} else if(n >= 50) {
				n -= 50;
				e++;
			} else if(n >= 10) {
				n -= 10;
				r++;
			} else {
				n--;
				t++;
			}
		}

		
		System.out.printf("오백원 짜리 ==> %d 개\n", q);
		System.out.printf("백원 짜리 ==> %d 개\n", w);
		System.out.printf("오십원 짜리 ==> %d 개\n", e);
		System.out.printf("십원 짜리 ==> %d 개\n", r);
		System.out.printf("바꾸지 못한 잔돈 ==> %d 개\n", t);
		
	}
}
