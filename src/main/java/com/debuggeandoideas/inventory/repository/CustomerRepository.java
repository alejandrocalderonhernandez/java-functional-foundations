package com.debuggeandoideas.inventory.repository;

import com.debuggeandoideas.inventory.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private final InMemoryRepository storage = new InMemoryRepository();

    public void save(Long id, Object entity) {
        storage.save(id, entity);
    }

    public Customer findById(Long id) {
        return (Customer) storage.findById(id); // cast manual — aquí truena
    }

    public List<Customer> findAll() {
        List<Customer> result = new ArrayList<>();
        for (Object obj : storage.findAll()) {
            result.add((Customer) obj); // truena si hay un Product adentro
        }
        return result;
    }

    public void delete(Long id) {
        storage.delete(id);
    }
}