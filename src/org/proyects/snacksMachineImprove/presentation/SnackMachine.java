package org.proyects.snacksMachineImprove.presentation;


import org.proyects.snacksMachineImprove.domain.Snack;
import org.proyects.snacksMachineImprove.service.IServiceSnacks;
import org.proyects.snacksMachineImprove.service.ServiceSnacksFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnackMachine {
    public static void main(String[] args) {
        snackMachine();
    }

    public static void snackMachine() {
        var exit = false;
        var console = new Scanner(System.in);

        IServiceSnacks serviceSnacks = new ServiceSnacksFile(); // This is a reference to the interface, it can be used to call the methods of the class that implements the interface

        List<Snack> snacks = new ArrayList<>(); // This is a local variable, it is only accessible in this method

        System.out.println("==== Welcome to the Snack Machine ====");
        serviceSnacks.showSnacks();

        while (!exit) {
            try {
                var option = showMenu(console);
                exit = processOption(option, console, snacks, serviceSnacks);
            } catch (Exception e) {
                System.out.println("A problem occurred: " + e.getMessage());
            } finally {
                System.out.println();
            }

        }
    }

    private static int showMenu(Scanner console) {
        System.out.print(""" 
                ==== Menu ====
                1. Buy a snack
                2. Show ticket
                3. Add a snack
                4. Exit
                Choose an option:\s""");

        return Integer.parseInt(console.nextLine());
    }


    private static boolean processOption(int option, Scanner console, List<Snack> snacks, IServiceSnacks serviceSnacks) {
        var exit = false;

        switch (option) {
            case 1 -> buySnack(console, snacks, serviceSnacks);
            case 2 -> showTicket(snacks);
            case 3 -> addSnack(console, serviceSnacks);
            case 4 -> {
                System.out.println("Thanks for using the Snack Machine");
                exit = true;
            }
            default -> System.out.println("Invalid option, please try again");
        }

        return exit;
    }

    private static void buySnack(Scanner console, List<Snack> snacks, IServiceSnacks serviceSnacks) {
        System.out.println("==== Buy a snack ====");
        System.out.println("Choose a snack (id): ");
        var snackId = Integer.parseInt(console.nextLine());
        var snackFound = false;

        for (var snack : serviceSnacks.getSnacks()) {
            if (snack.getSnackId() == snackId) {
                snacks.add(snack);
                System.out.println("Snack added to the ticket: " + snack);
                snackFound = true;
                break;
            }
        }

        if (!snackFound) {
            System.out.println("Snack not found " + snackId);
        }

    }

    private static void showTicket(List<Snack> snacks) {
        var ticket = "*** Ticket ***";
        var total = 0.0;

        for (var snack : snacks) {
            ticket += "\n\t-" + snack.getName() + " - $" + snack.getPrice();
            total += snack.getPrice();
        }

        ticket += "\n\tTotal: $" + total;

        System.out.println(ticket);
    }

    private static void addSnack(Scanner console, IServiceSnacks serviceSnacks) {
        System.out.println("==== Add a snack ====");
        System.out.print("Name: ");
        var name = console.nextLine();
        System.out.print("Price: ");
        var price = Double.parseDouble(console.nextLine());
        serviceSnacks.addSnack(new Snack(name, price));
        System.out.println("Snack added successfully");
        serviceSnacks.showSnacks();
    }
}
