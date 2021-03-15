
public class EnumMethodTest {
	public static void main(String[] args) {
		//name()
		ET a = ET.A;
		String name = a.name();
		System.out.println(name);
		System.out.println();
		
		//ordinal()
		int ordinal = a.ordinal();
		System.out.println(ordinal);
		System.out.println();
		
		//comporeTo()
		ET b = ET.B;
		ET d = ET.D;
		int s1 = b.compareTo(d);
		int s2 = d.compareTo(b);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		//valueOf()
		String s = "E";
		ET e = ET.valueOf(s);
		System.out.println(e);
		System.out.println();
		
		//values()
		ET[] array = ET.values();
		for(ET aa : array) {
			System.out.println(aa);
		}
				
	}
}
