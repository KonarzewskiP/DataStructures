package src.udemy.data_structures_and_algorithms.lists.challenge.x2_insertSorted;

public class Main {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();

        list.insertSorted(3);
        list.print();
        list.insertSorted(-4);
        list.print();
        list.insertSorted(11);
        list.print();
        list.insertSorted(7);
        list.print();
        list.insertSorted(-3);
        list.print();
        list.insertSorted(0);
        list.print();
    }
}
