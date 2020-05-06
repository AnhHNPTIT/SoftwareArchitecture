package AdapterPattern;
public class Sparrow implements Bird{
    // a concrete implementation of Bird
    @Override
    public void fly(){
        System.out.println("Flying");
    }
    
    @Override
    public void makeSound(){
        System.out.println("Chirp Chirp");
    }
}
