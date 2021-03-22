
class Test {
	private String fieldName;
	
	Test(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
}

public class Student {
	public static void main(String[] args) {
		Test t = new Test("2208");
		System.out.println(t.getFieldName());
		t.setFieldName("손채건");
		System.out.println(t.getFieldName());
	}
}
