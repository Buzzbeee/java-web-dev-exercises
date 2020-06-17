package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        alice = alice.toLowerCase();
        System.out.println("Input word or term to see if it is in the first sentence of 'Alice's Adventure in Wonderland'");
        String term = input.nextLine();
        term = term.toLowerCase();
        if (alice.contains(term)) {
            System.out.println("term is located in sentence at index: " + alice.indexOf(term) + " and has a length of " + term.length());
            alice = alice.replace(term, "");
            System.out.println(alice);
        } else {
            System.out.println("term not found");
        }
    }

}
