package src.main.queue;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class QueueArr<T> implements Iterable<T> {

    private T[] arr;
    private int size = 0;
    private int indexFront = 0;
    private int indexBack = 0;

    public QueueArr(int length) {
        this.arr = (T[]) new Object[length];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // Peek at the front of the queue
    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        return arr[indexFront];
    }

    // Poll / Dequeue an element from the front of the queue
    public T poll() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");

        T temp = arr[indexFront];
        arr[indexFront] = null;
        indexFront = (++indexFront) % arr.length;
        size--;

        return temp;
    }

    public void enqueue(T element) {
        if ((indexBack + 1) % arr.length == indexFront)
            throw new RuntimeException("Queue is full");

        if (!isEmpty()) {
            indexBack = (++indexBack) % arr.length;
        }
        arr[indexBack] = element;
        size++;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;
            int index = indexFront;

            @Override
            public boolean hasNext() {
                return counter++ < arr.length;
            }

            @Override
            public T next() {
                return arr[(index++) % arr.length];
            }
        };
    }
}
