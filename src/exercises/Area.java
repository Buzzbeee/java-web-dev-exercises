package exercises;
import java.util.Scanner;


public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are about to calculate the area of a rectangle...");
        System.out.println("Please input the length of your rectangle:");
        String length = input.nextLine();
        System.out.println("Please input the width of your rectangle:");
        String width = input.nextLine();
        System.out.println("The are of the rectangle is " + Integer.parseInt(length) * Integer.parseInt(width));
    }

}
