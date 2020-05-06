package BridgePattern;
public class AnhHN{
    public static void main (String[] args) {
        // open a CheckingAccount at ViettinBank
        Bank viettinBank = new ViettinBank(new CheckingAccount());
        viettinBank.openAccount();
        
        // open a SavingAccount at TechcomBank
        Bank techcomBank = new TechcomBank(new SavingAccount());
        techcomBank.openAccount();
    }
}

