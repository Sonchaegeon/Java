
public class Array {
	public static void main(String[] args) {
		String[] old1 = { "java", "array", "copy" };
		String[] new1 = new String[5];
		
		System.arraycopy(old1, 0, new1, 0, old1.length);
		
		for(int i = 0; i < old1.length; i++) {
			System.out.println(new1[i]);
		}
	}
}
