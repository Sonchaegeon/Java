package generic;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Box box = new Box();
        box.setObject("홍길동");
        String nme = (String)box.getObject();

        box.setObject(apple);
        System.out.println(box.getObject());
    }
}
