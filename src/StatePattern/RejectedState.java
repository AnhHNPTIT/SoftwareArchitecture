package StatePattern;
public class RejectedState implements State{
    @Override
    public void handleRequest(){
        System.out.println("Approved");
    }
}

