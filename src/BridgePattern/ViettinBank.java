package BridgePattern;
public class ViettinBank extends Bank{
    public ViettinBank(Account account){
        super(account);
    }
    
    public void openAccount(){
        System.out.print("Open your account at ViettinBank is a ");
        account.openAccount();
    }
}

