package P1;

import java.util.Scanner;

public class six {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String c, y;
		
		System.out.print("철수 : ");
		c = s.next();
		System.out.println("영희 : ");
		y = s.next();
		
		if(c.equals(y))
			System.out.println("무승부!");
		else if(c.equals("r")) {
			if(y.equals("p"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		} else if (c.equals("p")) {
			if(y.equals("s"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		} else {
			if(y.equals("r"))
				System.out.println("영희 승!");
			else
				System.out.println("철수, 승!");
		}
	}
}
