package Ex3_Assign3;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName()); // TPBank
        
        bank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName()); // VietcomBank
        
        bank = BankFactory.getBank(BankType.TECHCOMBANK);
        System.out.println(bank.getBankName()); // TechcomBank
        
        bank = BankFactory.getBank(BankType.VIETTINBANK);
        System.out.println(bank.getBankName()); // ViettinBank        
    }
}

