package src.udemy.data_structures_and_algorithms.stack.array;

import src.udemy.data_structures_and_algorithms.Employee;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;
/**
 * peek()
 * push()
 * pop()
 * */
public class ArrayStack {
    private Employee[] stack;
    private int tail;
    private int size;

    public ArrayStack(Employee[] stack) {
        this.stack = stack;
    }

    public ArrayStack(int size) {
        this.stack = new Employee[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == stack.length;
    }

    public Employee peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return stack[tail - 1];
    }

    public Employee push(Employee newEmployee) {
        if (isFull()) {
            Employee[] newArray = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, size);
            stack = newArray;
        }
        stack[tail++] = newEmployee;
        size++;
        return newEmployee;
    }

    public Employee pop() {
        if (isEmpty())
            throw new EmptyStackException();

        Employee deletedEmployee = stack[tail];
        stack[tail--] = null;
        size--;
        return deletedEmployee;
    }

    public void printStack(){
        Arrays.stream(stack).filter(Objects::nonNull).forEach(System.out::println);
    }


}
