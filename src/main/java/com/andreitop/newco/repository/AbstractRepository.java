package com.andreitop.newco.repository;

import com.andreitop.newco.dto.AbstractDto;

import java.util.List;

public interface AbstractRepository<T extends AbstractDto> {

    List<T> findAll();

    T findById(final Long id);

    void save(final T object);

    void delete(final Long id);

    void update(final T newObject);
}