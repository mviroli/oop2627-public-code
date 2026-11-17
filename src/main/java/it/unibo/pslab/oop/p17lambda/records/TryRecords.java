package it.unibo.pslab.oop.p17lambda.records;

import java.util.Objects;

public class TryRecords {

    // basic record
    record Person(String name, String surname, int year){}

    interface Product{
        int id();
        String name();
    }

    // a record implementing an interface
    record ProductImpl(String name, int id) implements Product {
        public ProductImpl{ // changing primary constructor
            Objects.requireNonNull(name);
        }
        public ProductImpl(int id){ // adding another constructor
            this("", id);
        }
    }

    public static void main(String[] args){
        Person person = new Person("mario", "rossi", 1980);
        IO.println(person + " " + person.name() + " " + person.surname());
        Product product = new ProductImpl("fruit", 100);
        IO.println(product);
        IO.println(new ProductImpl(0));
        // IO.println(new ProductImpl(null, 101)); // eccezione
    }
}
