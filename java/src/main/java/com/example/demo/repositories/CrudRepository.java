package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T,ID>{
    public T save(T entity);
    public List<T> findAll();
    public Optional<T> findById(ID id);
    public Optional<T> findByName(ID id);
    boolean existsById(ID id);
    public void delete(T entity);
    public void deleteById(ID id);
    public long count();
}
