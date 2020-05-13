package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class AnhHN{
    public static void main (String[] args) {
        List<Memento> savedStates = new ArrayList<>();
        
        Originator originator = new Originator();
        originator.set("State #1");
        originator.set("State #2");
        savedStates.add(originator.saveToMemento());
        originator.set("State #3");
        savedStates.add(originator.saveToMemento());
        originator.set("State #4");
        
        originator.restoreFromMemento(savedStates.get(1));
    }
}
