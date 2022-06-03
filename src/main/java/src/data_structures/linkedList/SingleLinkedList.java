package src.data_structures.linkedList;

import java.util.Iterator;



@SuppressWarnings("unchecked")
public class SingleLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SingleLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T element) {
        if (size == 0) {
            head = new Node<>(element);
            tail = head;
            head.next = tail;
        } else {
            Node<T> temp = new Node<>(element);
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public boolean contains(T element) {
        if (isEmpty()) throw new IllegalArgumentException("List is empty");
        Node<T> tempNode = head;
        while (tempNode != null && tempNode.value != element) {
            tempNode = tempNode.next;
        }
        return tempNode != null;
    }

    public Node find(T element) {
        if (isEmpty()) throw new IllegalArgumentException("List is empty");
        Node<T> tempNode = head;
        while (tempNode != null && tempNode.value != element) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    /**
     * return null if element not found
     */
    public T remove(T element) {
        if (isEmpty()) throw new IllegalArgumentException("List is empty");

        Node<T> parentNode = null;
        Node<T> currentNode = head;
        if (currentNode.value == element) {
            head = head.next;
            currentNode = null;
            return element;
        }

        while (currentNode != null && currentNode.value != element) {
            parentNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode == null)
            return null;

        parentNode.next = currentNode.next;
        currentNode = null;
        return element;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> trav = head;

            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.value;
                trav = trav.next;
                return data;
            }
        };
    }

    private class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
