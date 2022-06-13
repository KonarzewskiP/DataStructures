package src.udemy.data_structures_and_algorithms.queue.array;

import src.main.arrays.Array;
import src.udemy.data_structures_and_algorithms.Employee;

public class Runner {
    public static void main(String[] args) {
        Employee jJ = new Employee("J", "J", 123);
        Employee dD = new Employee("D", "D", 412);
        Employee fF = new Employee("F", "F", 512);
        Employee bB = new Employee("B", "B", 231);
        Employee cC = new Employee("C", "C", 443);

        ArrayQueue queue = new ArrayQueue(3);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.add(jJ);
        queue.add(dD);
        queue.add(fF);
        queue.add(bB);
        queue.add(cC);
        queue.add(jJ);

        System.out.println(queue.peek());
        queue.printQueue();
        System.out.println("REMOVE -> " + queue.remove());
        System.out.println("REMOVE -> " + queue.remove());
        queue.printQueue();
        queue.add(jJ);
        queue.add(dD);
        queue.add(dD);
        queue.add(fF);
        queue.printQueue();
        System.out.println("REMOVE -> " + queue.remove());
        System.out.println("REMOVE -> " + queue.remove());
        System.out.println("REMOVE -> " + queue.remove());
        System.out.println("REMOVE -> " + queue.remove());
        System.out.println("REMOVE -> " + queue.remove());
        System.out.println("REMOVE -> " + queue.remove());
        System.out.println("REMOVE -> " + queue.remove());
        System.out.println("REMOVE -> " + queue.remove());
        queue.printQueue();
        queue.add(bB);
        queue.add(cC);
        queue.printQueue();
    }
}
