package src.data_structures;

import src.data_structures.linkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();

        list.add(2);
        list.add(4);
        list.add(7);

//        System.out.println(list.contains(32));
//        System.out.println(list.isEmpty());
//        System.out.println(list.find(4));


        for (Integer val : list) {
            System.out.println(val);
        }

        list.remove(4);
        list.remove(2);
        System.out.println(list.isEmpty());
        list.remove(7);
        System.out.println("----------------------");
        for (Integer val : list) {
            System.out.println(val);
        }

    }

}
