package org.proyects.snacksMachineImprove.service;

import org.proyects.snacksMachineImprove.domain.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiceSnacksFile implements IServiceSnacks {
    private final String FILE_NAME = "snacks.txt"; // This is a constant, it cannot be modified and represents the name of the file
    private List<Snack> snacks = new ArrayList<>(); // This is an instance variable, it is only accessible in this class, it is used to store the snacks

    public ServiceSnacksFile() {
        var file = new File(FILE_NAME); // Create a new file object
        var exists = false;

        try {
            exists = file.exists(); // Check if the file exists
            if (file.exists()) {
                this.snacks = getFileSnacks(); // Get the snacks from the file
            } else {
                var output = new PrintWriter(new FileWriter(file));
                output.close();
                System.out.println("The file was created successfully");
            }
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e.getMessage());
        }

        if (!exists) {
            chargeSnacks();
        }
    }

    private void chargeSnacks() {
        this.addSnack(new Snack("Chocolate", 1.5));
        this.addSnack(new Snack("Chips", 1.0));
        this.addSnack(new Snack("Soda", 1.0));
        this.addSnack(new Snack("Water", 0.5));
    }

    private List<Snack> getFileSnacks() {
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            for (var line : lines) {
                String[] parts = line.split(", "); // Split the line by the comma and space
                var idSnack = Integer.parseInt(parts[0]);
                var name = parts[1];
                var price = Double.parseDouble(parts[2]);
                var snack = new Snack(name, price);
                snacks.add(snack);
            }

        } catch (Exception e) {
            System.out.println("A problem occurred: " + e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }

    @Override
    public void addSnack(Snack snack) {
        this.snacks.add(snack);
        this.saveSnacks(snack);
    }

    private void saveSnacks(Snack snack) {
        boolean append = false;
        var file = new File(FILE_NAME);

        try {
            append = file.exists();
            var output = new PrintWriter(new FileWriter(file, append));
            output.println(snack.writeSnack());
            output.close();

        } catch (Exception e) {
            System.out.println("A problem occurred: " + e.getMessage());
        }
    }

    @Override
    public void showSnacks() {
        var snacksInventory = "";
        for (var snack : this.snacks) {
            snacksInventory += snack.toString() + "\n";
        }

        System.out.println("==== ServiceSnacksFile Inventory ====");
        System.out.println(snacksInventory);

    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
