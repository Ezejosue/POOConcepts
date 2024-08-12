package org.proyects.snacksMachine.models;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks; // This is a static variable, it is shared by all instances of the class

    // This is a static block, it is executed when the class is loaded
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Chocolate", 1.5));
        snacks.add(new Snack("Chips", 1.0));
        snacks.add(new Snack("Soda", 1.0));
        snacks.add(new Snack("Water", 0.5));
        snacks.add(new Snack("Candy", 0.5));
        snacks.add(new Snack("Gum", 0.25));
    }

    public static void addSnack(Snack snack) { // This is a static method for adding a snack
        snacks.add(snack);
    }

    public static void showSnacks() { // This is a static method for showing the snacks
        var snacksInventory = "";
        for (var snack : snacks) {
            snacksInventory += snack.toString() + "\n";
        }

        System.out.println("==== Snacks Inventory ====");
        System.out.println(snacksInventory);
    }

    public static List<Snack> getSnacks() { // This is a static method for getting the snacks
        return snacks;
    }
}
