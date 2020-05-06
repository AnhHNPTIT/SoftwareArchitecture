package AdapterPattern;
public class AnhHN{
    public static void main (String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        
        // Wrap a Bird in a BirdAdapter so that it behaves like ToyDuck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        
        System.out.println("Sparrow:");
        sparrow.fly();
        sparrow.makeSound();
        
        System.out.println("PlasticToyDuck:");
        toyDuck.squeak();
        
        //ToyDuck behaving like a Bird
        System.out.println("BirdAdapter:");
        birdAdapter.squeak();
    }
}
