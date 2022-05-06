package src.main.doubleLinkedList;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    //Internal node class to represent data
    private class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    // Empty this linked list, O(n)
    public void clear() {
        Node<T> trav = head;
        while (trav != null) {
            Node<T> next = trav.next;
            trav.prev = null;
            trav.next = null;
            trav.data = null;
            trav = next;
        }
        head = null;
        tail = null;
        trav = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    //Is this linked list empty?
    public boolean isEmpty() {
        return size() == 0;
    }

    //Add an element to the tail of the linked list, O(1)
    public void add(T elem) {
        addLast(elem);
    }

    //Add an element to the beginning of this linked list, O(1)
    public void addFirst(T elem) {
        //The linked list is empty
        if (isEmpty()) {
            head = tail = new Node<>(elem, null, null);
        } else {
            head.prev = new Node<>(elem, null, head);
            head = head.prev;
        }
        size++;
    }

    // Add a node to the tail of the linked list, O(1)
    public void addLast(T elem) {
        //The linked list is empty
        if (isEmpty()) {
            head = tail = new Node<>(elem, null, null);
        } else {
            tail.next = new Node<>(elem, tail, null);
            tail = tail.next;
        }
        size++;
    }

    // Check the value of the first node if it exist, O(1)
    public T peekFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return head.data;
    }

    //Check the value of the last node if is exist, O(1)
    public T peekLast() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return tail.data;
    }

    //Remove the fist value at the head of the linked list, O(1)
    public T removeFirst() {

        if (isEmpty()) throw new RuntimeException("Empty list");
        Node<T> temp = head;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return temp.data;
    }

    //Remove the last value at the tail of the linked list, O(1)
    public T removeLast() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        Node<T> temp = tail;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return temp.data;
    }

    // Removed an arbitrary node from the linked list, O(1)
    // method is private because the Node class itself is private and
    // user should not have access to it.
    // This method is used internally to managed the list
    private T remove(Node<T> node) {

        //If the node to remove is somewhere either at the
        // head or the tail handle those independently
        if (node.prev == null) return removeFirst();
        if (node.next == null) return removeLast();

        // Make the pointers of adjacent nodes skip ove 'node'
        node.prev.next = node.next;
        node.next.prev = node.prev;

        T temp = node.data;

        node.next = null;
        node.prev = null;
        size--;

        return temp;
    }

    //Remove a node at a particular index, O(n)
    public T removeAt(int index) {
        //Make sure the index provided it valid
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        Node<T> nodeToRemove;

        if (index < size / 2) {
            nodeToRemove = head;
            for (int i = 0; i < index; i++) {
                nodeToRemove = nodeToRemove.next;
            }
        } else {
            nodeToRemove = tail;
            for (int i = size - 1; i > index; i--) {
                nodeToRemove = nodeToRemove.prev;
            }
        }
        return remove(nodeToRemove);
    }

    // Remove a particular value in the linked list, O(n)
    public boolean remove(Object obj) {

        Node<T> trav = head;

        //Support searching for null
        if (obj == null) {
            for (; trav != null; trav = trav.next) {
                if (trav.data == null) {
                    remove(trav);
                    return true;
                }
            }
        } else {
            // search for non null objects
            for (; trav != null; trav = trav.next) {
                if (obj.equals(trav.data)) {
                    remove(trav);
                    return true;
                }
            }
        }
        return false;
    }

    // Find the index of a particular value in the linked list, O(n)
    public int indexOf(Object obj) {
        int index = 0;
        Node<T> trav = head;

        //Support searching for null
        if (obj == null) {
            while (trav.data != null) {
                index++;
                trav = trav.next;
            }
            return index;
        } else {
            // search for non null objects
            while (trav.data != obj && trav.next != null) {
                index++;
                trav = trav.next;
            }
        }
        return obj.equals(trav.data) ? index : -1;
    }

    // Check if a value is contained within the linked list
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
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
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("[");
        Node<T> trav = head;
        while (trav != null) {
            sb.append(trav.data).append(", ");
            trav = trav.next;
        }
        return sb.append("]").toString();

    }

    ;
}
