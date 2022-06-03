package src.data_structures_and_algorithms.Lists.challenge.x1_addBefore;


import src.data_structures_and_algorithms.Lists.challenge.Planet;
import src.data_structures_and_algorithms.Lists.challenge.PlanetNode;

import java.util.Comparator;

/**
 * Implement double linked list for Planet
 * - isEmpty()
 * - size()
 * - addFront
 * - addEnd
 * - removeFront
 * - removeEnd
 * - remove(Planet planet)
 * <p>
 * - addBefore(Planet p1, Planet p2) - insert a new Planet before
 * existing Planet in the list.
 * p1 - existing planet in the list
 * p2 - new planet
 */

/**
 * null <- p1 <=> p2 <=> p3 <=> p4 -> null
 * p1 - head = front
 * p4 - tail = end
 */
public class DoubleLinkedList {
    private PlanetNode head;
    private PlanetNode tail;
    private int size;

    public DoubleLinkedList() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addToTheFront(Planet planet) {
        if (planet == null) throw new IllegalArgumentException("Planet is null");
        PlanetNode node = new PlanetNode(planet);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
        }

        head = node;
        size++;
    }

    public void addToTheBack(Planet planet) {
        if (planet == null) throw new IllegalArgumentException("Planet is null");
        PlanetNode node = new PlanetNode(planet);
        node.setPrev(tail);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }


    public PlanetNode removeFront() {
        if (isEmpty()) throw new IllegalArgumentException("List is empty");

        PlanetNode removedNode = head;
        head = head.getNext();

        if (head == null) {
            tail = null;
        } else {
            head.setPrev(null);
            removedNode.setNext(null);
        }
        size--;
        return removedNode;
    }

    public PlanetNode removeEnd() {
        if (isEmpty()) throw new IllegalArgumentException("List is empty");

        PlanetNode removedNode = tail;
        tail = tail.getPrev();

        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
            removedNode.setPrev(null);
        }
        size--;
        return removedNode;
    }

    /**
     * null <- p1 <=> p2 <=> p3 <=> p4 -> null
     * p1 - head = front
     * p4 - tail = end
     * <p>
     * null <- p1 -> null
     */
    // return null if element not found
    public PlanetNode remove(Planet planet) {
        if (isEmpty()) throw new IllegalArgumentException("List is empty");
        if (planet == null) throw new IllegalArgumentException("List does not accept null elements. Planet is null");

        PlanetNode current = head;
        while (current != null && !current.getPlanet().equals(planet))
            current = current.getNext();

        if (current == null)
            return null;

        if (current.getNext() != null)
            current.getNext().setPrev(current.getPrev());
        if (current.getPrev() != null)
            current.getPrev().setNext(current.getNext());

        current.setNext(null);
        current.setPrev(null);
        size--;
        return current;
    }

    public void addBefore(Planet planet1, Planet planet2) {
        if (planet2 == null || planet1 == null)
            throw new IllegalArgumentException("List does not accept null elements. Planet is null");

        PlanetNode current = head;
        while (current != null && !current.getPlanet().equals(planet1)) {
            current = current.getNext();
        }

        if (current == null) {
            addToTheFront(planet2);
            return;
        }
        PlanetNode newNode = new PlanetNode(planet2);
        newNode.setNext(current.getNext());
        newNode.setPrev(current);
        if (current.getNext() != null) {
            current.getNext().setPrev(newNode);
        }
        current.setNext(newNode);
    }


    public void print() {
        PlanetNode node = head;
        System.out.print(" HEAD -> ");
        while (node != null) {
            System.out.print(node.getPlanet());
            System.out.print(" <=> ");
            node = node.getNext();
        }
        System.out.println(" NULL");
    }
}


































