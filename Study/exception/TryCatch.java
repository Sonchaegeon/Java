package exception;

public class TryCatch {
    public static void main(String[] args) {
        // 이클립스는 일반 예외가 발생할 가능성이 있는 코드를 작성하면
        // 빨간 밑줄을 그어 예외 처리 코드의 필요성을 알려준다.
        // Class clazz = Class.forName("java.lang.String2");

        // Class.forName() 메소드는 매개값으로 주어진 클래스가 존재하면
        // Class 객체를 리턴하지만,
        // 존재하지 않으면 ClassNotFoundException 예외를 발생 시킨다.
        String data1 = null;
        String data2 = null;

        try {
            Class clazz = Class.forName("java.lang.String2");
        } catch(ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }

        try {
            data1 = args[0];
            data2 = args[1];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개 값의 수가 부족합니다.");
            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
