package src.main;

import src.main.queue.QueueArr;


public class Main {

    public static void main(String[] args) {
        QueueArr<Integer> queue = new QueueArr<>(4);

        System.out.println("SIZE: " + queue.size());
        System.out.println("IS_EMPTY: " +queue.isEmpty());
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
//        queue.enqueue(4);
//        queue.enqueue(25);
        print(queue);
        System.out.println("SIZE: " + queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println("SIZE: " + queue.size());
        queue.enqueue(6);
        System.out.println(queue.poll());
        queue.enqueue(1);
        print(queue);
        System.out.println("---------------------");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("SIZE: " + queue.size());
        System.out.println(queue.poll());
        System.out.println("SIZE: " + queue.size());
        System.out.println("IS_EMPTY: " +queue.isEmpty());
    }


    private static void print(QueueArr<Integer> list){
        System.out.println("Printing List: ");
        for (Integer el : list){
            System.out.println(el);
        }
    }
}
