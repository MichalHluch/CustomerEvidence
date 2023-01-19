package cz.michal.files;

import cz.michal.files.exceptions.NegativeNumberException;

public class Customer {

    private String name;
    private int sold;

    public Customer(String name, int sold) {
        this.name = name;
        this.sold = sold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public void increaseSold(int sold) throws NegativeNumberException {
        if(sold < 0) {
            throw new NegativeNumberException();
        }

        this.sold += sold;
    }

    @Override
    public String toString() {
        return name + Main.SPLITTER + sold;
    }
}
