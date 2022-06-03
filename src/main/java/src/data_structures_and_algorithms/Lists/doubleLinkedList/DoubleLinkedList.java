package src.data_structures_and_algorithms.Lists.doubleLinkedList;

import src.data_structures_and_algorithms.Lists.Employee;

/**
 * null <- [a] <=> [b] <=> [c] <=> [c] -> null
 * a - head = front
 * c - tail = end
 */
public class DoubleLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        if (employee == null) throw new IllegalArgumentException("Employee is null");
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (isEmpty()) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        if (employee == null) throw new IllegalArgumentException("Employee is null");
        EmployeeNode node = new EmployeeNode(employee);
        node.setPrevious(tail);

        if (isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    /**
     * null <- [a] <=> [b] <=> [c] <=> [d] -> null
     * a - head = front
     * d - tail = end
     * <p>
     * null <- [o] -> null
     * o - head = tail
     */
    public EmployeeNode removeFromFront() {
        if (isEmpty()) return null;

        EmployeeNode removedNode = head;
        head = head.getNext();
        if (head != null) {
            head.setPrevious(null);
            removedNode.setNext(null);
        } else
            tail = null;
        size--;
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) return null;

        EmployeeNode removedNode = tail;
        tail = tail.getPrevious();
        if (tail != null) {
            tail.setNext(null);
            removedNode.setPrevious(null);
        } else
            head = null;
        size--;
        return removedNode;
    }


    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getEmployee());
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println(" NULL ");
    }
}
