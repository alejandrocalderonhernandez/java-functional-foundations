package com.debuggeandoideas;

import com.debuggeandoideas.inventory.domain.Customer;
import com.debuggeandoideas.inventory.domain.Product;
import com.debuggeandoideas.inventory.repository.CustomerRepository;

public class Main {

    public static void main(String[] args) {

        CustomerRepository customerRepo = new CustomerRepository();

        // saving customers
        customerRepo.save(1L, new Customer(1L, "John",  "john@example.com"));
        customerRepo.save(2L, new Customer(2L, "Jane", "jane@example.com"));

        // BUG: nobody stops this — compiles clean, blows up at runtime
        customerRepo.save(3L, new Product(3L, "Laptop", 999.99));

        // ClassCastException
        Customer c = customerRepo.findById(3L);
        System.out.println(c.getFullName());

    }
}