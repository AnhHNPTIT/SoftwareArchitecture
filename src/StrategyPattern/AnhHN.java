package StrategyPattern;
public class AnhHN{
    public static void main (String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Hoang");
        sortedList.add("Ngoc");
        sortedList.add("Anh");
        
        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();
        
        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}

