package system;

public class Property {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.hoem");

        System.out.println("osName = " + osName);
        System.out.println("userName = " + userName);
        System.out.println("userHome = " + userHome);
    }
}
