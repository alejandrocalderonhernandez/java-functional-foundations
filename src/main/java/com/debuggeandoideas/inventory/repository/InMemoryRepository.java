package com.debuggeandoideas.inventory.repository;

import java.util.*;

public class InMemoryRepository {

    private final Map<Long, Object> storage = new HashMap<>();

    public void save(Long id, Object entity) {
        storage.put(id, entity);
    }

    public Object findById(Long id) {
        return storage.get(id);
    }

    public List<Object> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void delete(Long id) {
        storage.remove(id);
    }
}