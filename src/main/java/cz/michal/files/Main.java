package cz.michal.files;

import cz.michal.files.utils.FileUtils;

public class Main {

    public static final String PATH = "customers.txt";
    public static final String SPLITTER = ":";

    public static void main(String[] args) {
        CustomerEvidenceManager customerEvidenceManager = new CustomerEvidenceManager();


        customerEvidenceManager.addCustomer(new Customer("Testing Test", 205));
        customerEvidenceManager.addCustomer(new Customer("TEst", 2));

        customerEvidenceManager.removeLast();

        FileUtils.writeToFile(customerEvidenceManager.getCustomers());
    }

}
