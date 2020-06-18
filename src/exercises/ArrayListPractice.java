package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> intList;
        intList = Arrays.asList(intArr);
        System.out.println(sumOfEvenNums(intList));

        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        alice = alice.replaceAll("[^a-zA-Z0-9]", " ");
        List<String> aliceList = new ArrayList<>(Arrays.asList(alice.split(" ")));
        System.out.println("We will return words that contain how many letters?");
        int numOfLetters = input.nextInt();
        printFiveLetterWords(aliceList, numOfLetters);
    }

    public static int sumOfEvenNums(List<Integer> intList) {
        int sum = 0;
        for (int myInt : intList) {
            if (myInt % 2 == 0) {
                sum += myInt;
            }
        }
        return sum;
    }

    public static void printFiveLetterWords(List<String> stringList, int numOfLetters) {
        for (String str : stringList) {
            if (str.length() == numOfLetters) {
                System.out.println(str);
            }
        }
    }

}
