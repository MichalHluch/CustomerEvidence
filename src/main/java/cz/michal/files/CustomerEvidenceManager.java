package cz.michal.files;

import java.util.ArrayList;
import java.util.List;

public class CustomerEvidenceManager {

    private final List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void removeLast() {
        customers.remove(customers.size() - 1);
    }
}
