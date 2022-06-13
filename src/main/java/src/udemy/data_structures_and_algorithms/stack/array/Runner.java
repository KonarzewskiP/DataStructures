package src.udemy.data_structures_and_algorithms.stack.array;

import src.udemy.data_structures_and_algorithms.Employee;
import src.udemy.data_structures_and_algorithms.stack.linkedList.LinkedListStack;

public class Runner {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        Employee jJ = new Employee("J", "J", 123);
        Employee dD = new Employee("D", "D", 412);
        Employee fF = new Employee("F", "F", 512);
        Employee bB = new Employee("B", "B", 231);
        Employee cC = new Employee("C", "C", 443);

        stack.push(jJ);
        stack.push(dD);
        stack.push(fF);
        stack.push(bB);
        stack.push(cC);

        stack.printStack();
        System.out.println("---------------------------------------");


        System.out.println(stack.peek());
    }
}
