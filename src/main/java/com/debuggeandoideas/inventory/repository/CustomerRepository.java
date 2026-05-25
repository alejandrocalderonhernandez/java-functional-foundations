package com.debuggeandoideas.inventory.repository;

import com.debuggeandoideas.inventory.domain.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerRepository implements Repository<Customer, Long> {

    private final InMemoryRepository storage = new InMemoryRepository();


    @Override
    public void save(Long id, Customer entity) {
        storage.save(id, entity);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.of((Customer) storage.findById(id));
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> result = new ArrayList<>();
        for (Object obj : storage.findAll()) {
            result.add((Customer) obj); // truena si hay un Product adentro
        }
        return result;
    }

    @Override
    public void delete(Long id) {
        storage.delete(id);
    }
}