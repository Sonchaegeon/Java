
public class UnknownParameter {
	static int sum(int ...x) {
		int s = 0;
		for(int i = 0; i < x.length; i++) {
			s += x[i];
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(sum(10, 20, 30, 40, 50));
	}
}
