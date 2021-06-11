package system;

public class ExitTest {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.exit(0);

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
