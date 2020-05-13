package MementoPattern;
public class Memento{
    private final String state;
    
    public Memento(String stateToSave){
        this.state = stateToSave;
    }
    
    public String getSavedState(){
        return state;
    }
}
