package cz.michal.files.utils;

import cz.michal.files.Customer;
import cz.michal.files.CustomerEvidenceManager;
import cz.michal.files.Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class FileUtils {


    public static void loadCustomers(CustomerEvidenceManager manager) {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(Main.PATH)));

            while (scanner.hasNextLine()) {
                String[] args = scanner.nextLine().split(Main.SPLITTER);

                int sold;
                try {
                    sold = Integer.parseInt(args[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input - integer");
                    return;
                }

                manager.addCustomer(new Customer(args[0], sold));
            }
        } catch (Exception e) {
            System.out.println("Please check your file, cannot load your file!");
        }
    }

    public static void writeToFile(List<Customer> customerList) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(Main.PATH))) {
            for (Customer customer : customerList) {
                writer.write(customer.toString());
            }
        } catch (Exception e) {
            System.out.println("Please check your file, cannot write!");
        }
    }

}
