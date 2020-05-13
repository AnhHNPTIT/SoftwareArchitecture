package ObserverPattern;
public class AnhHN{
    public static void main (String[] args) {
        AccountService acc1 = AccountService("anhhn97.ptit@gmail.com", "127.0.0.1");
        acc1.login();
        acc1.changeStatus(LoginStatus.Expired);
        
        System.out.println("---------------------");
        AccountService acc2 = AccountService("anhhn97.ptit@gmail.com", "116.108.77.231");
        acc2.login();
    }
}
