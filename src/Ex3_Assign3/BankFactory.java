package Ex3_Assign3;

public class BankFactory {
    private BankFactory() {
    }
    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
        case TPBANK:
            return new TPBank();
        case VIETCOMBANK:
            return new VietcomBank();
        case TECHCOMBANK:
            return new TechcomBank();
        case VIETTINBANK:
            return new ViettinBank();            
        default:
        throw new IllegalArgumentException("This bank type is unsupported");
        }
    }  
}
