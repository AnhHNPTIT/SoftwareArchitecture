package IteratorPattern;
public class AnhHN{
    public static void main (String[] args) {
        Menu menu = new Menu();
        ItemIterator<Item> iterator = menu.iterator();
        
        menu.addItem(new Item("Home", "/home"));
        menu.addItem(new Item("Java", "/java"));
        menu.addItem(new Item("Spring", "/spring"));
        
        while(iterator.hasNext()){
            Item item = iterator.next();
            System.out.println(item);
        }
    }
}
