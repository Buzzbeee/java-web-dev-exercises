package org.launchcode.java.studios.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {

    static HashMap<Character, Integer> countedChars = new HashMap<>();

    public static void main(String[] args){

        //String strToProcess = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string to count the occurrences of characters.");
        String strToProcess = input.nextLine();
        char[] charArr = strToProcess.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();

        for (char c : charArr) {
            incrementMap(c);
        }

        System.out.println(countedChars);
    }

    public static void incrementMap(char c) {
        if (countedChars.containsKey(c)) {
            countedChars.put(c, countedChars.get(c)+1);
        } else {
            countedChars.put(c, 1);
        }
    }
}
