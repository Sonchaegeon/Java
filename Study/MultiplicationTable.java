
public class Study3 {
	public static void main(String[] args) {
		int i, j;
		for(i = 2; i < 10; i++) {
			System.out.printf("#제 %d단# ", i);
		}
		System.out.println("\n");
		for(i = 2; i < 10; i++) {
			for(j = 1; j < 10; j++) {
				System.out.printf("%d X %d= %d ", i, j, i*j);
			}
			System.out.println("\n");
		}
	}
}
