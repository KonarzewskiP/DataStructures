package src.main.queue;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * A queue is a linear data structure which models real world queue
 * by having two primary operations, namely  enqueue and dequeue.
 */
public class Queue<T> implements Iterable<T> {

    private LinkedList<T> list = new LinkedList<>();

    public Queue() {
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Peek the element at the front of the queue
    // The method throws an error if the queue is empty
    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Queue Empty");

        return list.peekFirst();
    }

    // Poll an element from the front of the queue
    // The method throws an error if the queue is empty
    public T poll() {
        if (isEmpty())
            throw new RuntimeException("Queue Empty");

        return list.removeFirst();
    }
    public T dequeue() {
        if (isEmpty())
            throw new EmptyStackException();
        return list.removeFirst();
    }

    // Add an element to the back of the queue
    public void enqueue(T element) {
        list.addLast(element);
    }

    // Return an iterator to allow the user to traverse
    // through the elements found inside the queue
    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
