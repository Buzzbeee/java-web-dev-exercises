package org.launchcode.java.studios.menuproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    Menu(ArrayList<MenuItem> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuItems, menu.menuItems) &&
                Objects.equals(lastUpdated, menu.lastUpdated);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem item) {
        if (this.menuItems.contains(item)) {
            System.out.println("Menu item already exists on the menu");
        } else {
            this.menuItems.add(item);
        }
    }

    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
