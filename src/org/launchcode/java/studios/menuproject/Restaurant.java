package org.launchcode.java.studios.menuproject;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("pizza", "saucey", 2.99, "entre", false);
        MenuItem chips = new MenuItem("chips", "crisp", 2.99, "apetizer", false);
        MenuItem chicken = new MenuItem("chicken", "great", 2.99, "entre", true);

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(pizza);
        menuItems.add(chips);
        menuItems.add(chicken);

        Date currentDate = new Date();

        Menu menu = new Menu(menuItems, currentDate);
        System.out.println(menu);

        menu.removeMenuItem(pizza);
        System.out.println(menu);

        menu.addMenuItem(chips);
    }

}
