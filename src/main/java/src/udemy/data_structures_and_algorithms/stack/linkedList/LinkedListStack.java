package src.udemy.data_structures_and_algorithms.stack.linkedList;

import src.udemy.data_structures_and_algorithms.Employee;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * pop()
 * peek()
 * push()
 */
public class LinkedListStack {
    private final LinkedList<Employee> stack;
    private int size;

    public LinkedListStack() {
        this.stack = new LinkedList<>();
    }

    public boolean isFull() {
        return size == stack.size();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Employee peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return stack.get(size-1);
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee removedElement = stack.pop();
        stack.set(size--, null);
        return removedElement;
    }

    public void push(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException();
        }
        stack.push(employee);
        size++;
    }

    public void printStack() {
        stack.forEach(System.out::println);
    }

}
