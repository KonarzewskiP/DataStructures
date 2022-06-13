package src.udemy.data_structures_and_algorithms.queue.array;

import src.udemy.data_structures_and_algorithms.Employee;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * add()
 * remove()
 * peek()
 */
public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

    public boolean isEmpty() {
        return queue[front] == null && queue[back] == null;
    }

    // a = b = c = d
    // 0 = 1 = 2 = 3
    public boolean isFull() {
        return queue[back] != null;
    }


    public void add(Employee employee) {
        if (isFull()) {
            System.out.println("QUEUE IS FULL");
            Employee[] newArr = new Employee[queue.length * 2];
            System.arraycopy(queue, front, newArr, 0, queue.length - front);
            System.arraycopy(
                    queue,
                    0,
                    newArr,
                    queue.length - front,
                    back
            );
            front = 0;
            back = queue.length;
            queue = newArr;
        }

        queue[back++] = employee;
        if (back >= queue.length)
            back = 0;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue[front];
    }

    public Employee remove() {
        if (isEmpty())
            throw new NoSuchElementException();

        Employee temp = queue[front];
        queue[front++] = null;
        if (front >= queue.length)
            front = 0;
        return temp;
    }

    public void printQueue() {
        System.out.println("---------------PRINTING QUEUE---------------");
        System.out.println("FRONT:");
        for (int i = front, j = 0; j < queue.length; i++, j++) {
            int index = i % queue.length;
            System.out.println(queue[index]);
        }
    }
}
