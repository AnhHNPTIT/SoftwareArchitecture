package Ex5_Assign3;
public class MainApp {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "2.4GHz"));
        System.out.println("AbstractFactory PC config: " + pc);
        
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16GB", "1TB", "2.9GHz"));
        System.out.println("AbstractFactory Laptop config: " + laptop);
    }
    
}
