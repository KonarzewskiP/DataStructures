package src.udemy.data_structures_and_algorithms.lists.singleLinkedList;

import src.udemy.data_structures_and_algorithms.Employee;

public class Main {
    public static void main(String[] args) {
        Employee jJ = new Employee("J", "J", 123);
        Employee dD = new Employee("D", "D", 412);
        Employee fF = new Employee("F", "F", 512);
        Employee cC = new Employee("C", "C", 443);

        SingleLinkedList list = new SingleLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(jJ);
        list.addToFront(dD);
        list.addToFront(fF);
        list.addToFront(cC);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
