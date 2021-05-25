package method_generic;

public class BoxingMethodEx {

    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.getT();

        Box<String> box2 = Util.boxing("홍길동");
        String strValue = box2.getT();
    }
}
