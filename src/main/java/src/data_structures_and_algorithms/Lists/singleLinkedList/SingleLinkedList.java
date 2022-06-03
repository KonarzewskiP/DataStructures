package src.data_structures_and_algorithms.Lists.singleLinkedList;

import src.data_structures_and_algorithms.Lists.Employee;

public class SingleLinkedList {
    private EmployeeNode head;
    private int size;


    public void addToFront(Employee employee) {
        if (employee == null) throw new IllegalArgumentException("Employee is null");
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) return null;

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getEmployee());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println(" NULL ");
    }
}
