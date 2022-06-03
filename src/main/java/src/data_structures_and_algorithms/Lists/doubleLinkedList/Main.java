package src.data_structures_and_algorithms.Lists.doubleLinkedList;

import src.data_structures_and_algorithms.Lists.Employee;

public class Main {
    public static void main(String[] args) {
        Employee jJ = new Employee("J", "J", 123);
        Employee dD = new Employee("D", "D", 412);
        Employee fF = new Employee("F", "F", 512);
        Employee bB = new Employee("B", "B", 231);
        Employee cC = new Employee("C", "C", 443);

        DoubleLinkedList list = new DoubleLinkedList();


//        list.addToFront(jJ);
//        list.addToFront(dD);
//        list.addToFront(fF);
//        list.addToFront(cC);
        list.addToEnd(bB);
        list.addToEnd(bB);
        list.addToEnd(bB);

        System.out.println(list.getSize());

        list.printList();
        list.removeFromEnd();
        list.removeFromFront();
        list.printList();

        System.out.println(list.getSize());

    }
}
