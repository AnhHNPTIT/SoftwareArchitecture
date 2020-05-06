package BridgePattern;
public class TechcomBank extends Bank{
    public TechcomBank(Account account){
        super(account);
    }
    
    public void openAccount(){
        System.out.print("Open your account at TechcomBank is a ");
        account.openAccount();
    }
}

