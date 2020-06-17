package exercises;

import java.util.Scanner;

public class MPG {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are about to calculate your MPG...");
        System.out.println("Please input your miles driven:");
        String miles = input.nextLine();
        System.out.println("Please input total consumed gallons of gas:");
        String gallonsOfGas = input.nextLine();
        System.out.println("Your MPG is " + Integer.parseInt(miles) / Integer.parseInt(gallonsOfGas));
    }

}
