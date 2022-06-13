package src.udemy.data_structures_and_algorithms.lists.challenge.x1_addBefore;

import src.udemy.data_structures_and_algorithms.lists.challenge.Planet;

public class Main {

    public static void main(String[] args) {

        Planet p1 = new Planet("Mercury", 0);
        Planet p2 = new Planet("Venus", 0);
        Planet p3 = new Planet("Earth", 1);
        Planet p4 = new Planet("Mars", 2);
        Planet p5 = new Planet("Saturn", 82);
        Planet p6 = new Planet("Jupiter", 79);

        DoubleLinkedList list = new DoubleLinkedList();

        list.addToTheFront(p1);
        list.addToTheFront(p2);
        list.addToTheBack(p3);
        list.addToTheBack(p4);
        list.addToTheBack(p5);
        list.addToTheBack(p6);
        System.out.println(list.getHead());
        System.out.println(list.getTail());
        System.out.println(list.getSize());
        list.print();
        list.remove(p2);
        list.remove(p6);
        list.remove(p3);
        System.out.println("");
        System.out.println(list.getSize());
        list.print();
        list.addBefore(p1, p6);
        System.out.println("");
        list.print();
        System.out.println(list.getHead());
        System.out.println(list.getTail());
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        System.out.println();
//        Map<Planet, Integer> map = new HashMap<>();
//
//        map.put(p1, 20);
//        map.put(p2, 40);
//        map.put(p1, 50);
//
//        for (Map.Entry<Planet, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println("-----------------------------");
//        }
    }
}
