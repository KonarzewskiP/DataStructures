package src.udemy.data_structures_and_algorithms.stack.challenge.ex1_palindrome;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was is a car or a cat i saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));

    }

    public static boolean checkForPalindrome(String str) {
        ChallengeStack stack = new ChallengeStack();
        String modifiedStr = str.replaceAll("[\\W]", "").toLowerCase();
        char[] charArr = modifiedStr.toCharArray();
        for (char ch : charArr)
            stack.push(ch);

        for (char ch : charArr) {
            if (stack.pop() != ch) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkForPalindromeTwo(String str) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder strNoPunctuation = new StringBuilder(str.length());
        String lowerCase = str.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                strNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString().equals(strNoPunctuation.toString());
    }
}
