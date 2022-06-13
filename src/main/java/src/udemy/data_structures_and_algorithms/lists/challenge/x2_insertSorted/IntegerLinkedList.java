package src.udemy.data_structures_and_algorithms.lists.challenge.x2_insertSorted;


/**
 * Implement single linked list for Planet
 * - isEmpty()
 * - size()
 * - insertSorted - insert value in the list in order.
 * [4 , 2, 3] => [2, 3, 4]
 * - remove
 * - remove(Planet planet)
 */

/**
 * p1 -> p2 -> p3 -> p4 -> null
 * p1 - head = front
 * p4 - tail = end
 */
public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public IntegerLinkedList() {
    }

    private static class IntegerNode {
        private final int value;
        private IntegerNode next;

        public IntegerNode(Integer value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        /**
         * Allow to set next value as NULL
         * It will ease implementation
         */
        public void setNext(IntegerNode node) {
            next = node;
        }

        public IntegerNode getNext() {
            return next;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // p1 -> p2 -> p3 -> p4 -> null
    // [4, 2, 3] => [2, 3, 4]
    public void insertSorted(Integer value) {
        if (value == null) throw new IllegalArgumentException("Value can not be null");
        IntegerNode newNode = new IntegerNode(value);
        if (head == null || head.getValue() >= newNode.getValue()) {
            newNode.setNext(head);
            head = newNode;
            size++;
            return;
        }

        IntegerNode parentNode = null;
        IntegerNode current = head;
        while (current != null && current.getValue() < newNode.getValue()) {
            parentNode = current;
            current = current.getNext();
        }

        parentNode.setNext(newNode);
        newNode.setNext(current);
        size++;
    }


    public void print() {
        IntegerNode node = head;
        System.out.print(" HEAD -> ");
        while (node != null) {
            System.out.print(node.getValue());
            System.out.print(" -> ");
            node = node.getNext();
        }
        System.out.println(" NULL");
    }
}
