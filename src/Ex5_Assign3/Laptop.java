package Ex5_Assign3;
public class Laptop extends Computer{
    private String RAM;
    private String HDD;
    private String CPU;

    public Laptop(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }
    
    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getHDD() {
        return HDD;
    }

    @Override
    public String getCPU() {
        return CPU;
    }
    
}
