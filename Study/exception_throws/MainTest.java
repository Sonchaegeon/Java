package exception_throws;

public class MainTest {
    public static void main(String[] args) {
        Account ac = new Account();

        // 예금하기
        ac.deposit(10000);
        System.out.println("예금액: " + ac.getBalance());

        // 출금하기
        try {
            ac.withdraw(30000);
        } catch (BalanceInsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}
