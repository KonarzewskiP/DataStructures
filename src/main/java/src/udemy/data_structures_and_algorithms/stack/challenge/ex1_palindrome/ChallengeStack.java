package src.udemy.data_structures_and_algorithms.stack.challenge.ex1_palindrome;

import src.udemy.data_structures_and_algorithms.Employee;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ChallengeStack {
    private final LinkedList<Character> stack;

    public ChallengeStack() {
        this.stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Character pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    public void push(Character ch) {
        stack.push(ch);
    }
}
