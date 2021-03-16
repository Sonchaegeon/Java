
class Person {
	String name;
	int age;
	
	Person(String name) {
		this.name = name;
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class OverloadingTest {
	public static void main(String[] args) {
		Person p = new Person("thscorjs");
		Person pe = new Person("whghdnjs", 19);
		System.out.println(p.name);
		System.out.println(p.age);
		
		System.out.println(pe.name);
		System.out.println(pe.age);
	}
}
