package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input radius of circle:");
        Area area = new Area();
        String radiusInput;
        do {
            radiusInput = input.nextLine();
        } while (!area.checkValidDouble(radiusInput));

        double radius = Double.parseDouble(radiusInput);
        double areaResult = Circle.getArea(radius);
        System.out.println("Area: " + areaResult);
    }

    boolean checkValidDouble(String dbl) {
        try {
            Double.parseDouble(dbl);
            return true;
        } catch (Throwable err) {
            return false;
        }
    }

}
