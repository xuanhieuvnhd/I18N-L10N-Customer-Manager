package com.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IService<T> {
    Page<T> findAll(Pageable pageable);

    T findById(Long id);

    void save(T model);

    void remove(Long id);

    Iterable<T> findAll();
}
