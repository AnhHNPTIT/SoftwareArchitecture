package Ex5_Assign3;
public class LaptopFactory implements ComputerAbstractFactory{
    private String RAM;
    private String HDD;
    private String CPU;

    public LaptopFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }
    
    @Override
    public Computer createComputer() {
        return new Laptop(RAM, HDD, CPU);
    }
    
}
